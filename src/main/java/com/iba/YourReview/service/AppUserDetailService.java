package com.iba.YourReview.service;

import com.iba.YourReview.entity.AppUser;
import com.iba.YourReview.entity.Role;
import com.iba.YourReview.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class AppUserDetailService implements UserDetailsService {

    @Autowired
    private AppUserRepo appUserRepo;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username){
        AppUser appUser = appUserRepo.findByNickName(username);
        if (appUser == null) throw new UsernameNotFoundException(username);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for(Role role: appUser.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails.User(appUser.getNickName(), appUser.getPassword(), grantedAuthorities);
    }
}
