package com.iba.YourReview.service;

import com.iba.YourReview.entity.AppUser;
import com.iba.YourReview.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Service(value = "appUserService")
@Service
public abstract class AppUserService implements AppUserRepo {

    @Autowired
    private AppUserRepo appUserRepo;

    @Override
    public AppUser findByUsername(String userName) {
        return appUserRepo.findByUsername(userName);
    }

}
