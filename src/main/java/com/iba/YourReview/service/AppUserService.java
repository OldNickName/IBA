package com.iba.YourReview.service;

import com.iba.YourReview.entity.AppUser;
import com.iba.YourReview.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class AppUserService implements AppUserRepo {

    @Autowired
    private AppUserRepo appUserRepo;

    @Override
    public AppUser findByNick(String Nickname){
        return appUserRepo.findByNick(Nickname);
    }

}
