package com.iba.YourReview.controller;

import com.iba.YourReview.entity.AppUser;
import com.iba.YourReview.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private AppUserRepo appUserRepo;

    @GetMapping("/allUsers")
    public List<AppUser> allUsers() {
        return (List<AppUser>) appUserRepo.findAll();
    }

    @GetMapping("user/byName/{name}")
    public AppUser userByName(@PathVariable String name) {
        return appUserRepo.findByUsername(name);
    }

    @PostMapping("/registration")
    public void add(@RequestBody AppUser appUser) {
        AppUser user = appUserRepo.findByUsername(appUser.getUsername());
        System.out.println(user + "user");
        if (user != null) {
            System.out.println("тебя не было и ты есть теперь");
        }

        appUserRepo.save(appUser);
        System.out.println( "ты был" );
    }
}
