package com.iba.YourReview.controller;

import com.iba.YourReview.entity.AppUser;
import com.iba.YourReview.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

    @Autowired
    private AppUserRepo appUserRepo;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public AppUser registerUserAccount(@RequestBody AppUser appUser){
        return appUserRepo.save(appUser);
    }
}
