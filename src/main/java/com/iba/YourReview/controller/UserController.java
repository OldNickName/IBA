package com.iba.YourReview.controller;

import com.iba.YourReview.entity.AppUser;
import com.iba.YourReview.repository.AppUserRepo;
import com.iba.YourReview.service.AppUserService;
import com.iba.YourReview.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private AppUserRepo appUserRepo;

    @Autowired
    private SecurityService securityService;

    @GetMapping("/reg")
    public String registration(Model model) {
        model.addAttribute("userForm", new AppUser());

        return "registration";
    }

    @PostMapping("/reg")
    public String registration(@ModelAttribute("userForm") AppUser userForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        appUserRepo.save(userForm);

        securityService.autoLogin(userForm.getNickName(), userForm.getPassword());

        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }
}
