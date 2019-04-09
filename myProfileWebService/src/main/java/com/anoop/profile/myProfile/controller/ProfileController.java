package com.anoop.profile.myProfile.controller;


import com.anoop.profile.myProfile.outDto.Profile;
import com.anoop.profile.myProfile.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService){
        this.profileService = profileService;
    }

    @GetMapping("/getDetails")
    public String showSignUpForm(Model model) {
        model.addAttribute("profile", profileService.get(1));
        return "profile-details";
    }

    @GetMapping("/")
    public String homeTest(Model model) {
        model.addAttribute("profile", profileService.get(1));
        return "index";
    }
}
