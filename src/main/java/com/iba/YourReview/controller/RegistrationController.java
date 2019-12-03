
package com.iba.YourReview.controller;

import com.iba.YourReview.entity.AppUser;
import com.iba.YourReview.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @Autowired
    private AppUserRepo appUserRepo;

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/secured")
    public String secured(){
        return "secured";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(AppUser appUser){
        AppUser user = appUserRepo.findByNick(appUser.getNick());
        System.out.println(user);
        if(user != null) {
            System.out.println("wertyushbdhfbjs");
            return "registration";
        }

        appUserRepo.save(appUser);
        return "redirect:/login";
    }
}