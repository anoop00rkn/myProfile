package com.anoop.profile.controller;


import com.anoop.profile.entity.Profile;
import com.anoop.profile.service.ProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class profileController {

    private final ProfileService profileService;

    public profileController(ProfileService profileService){
        this.profileService = profileService;
    }

    @RequestMapping(value = "/getProfileDetails/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Profile getStudentDetailWithId(@PathVariable int id) {
        Profile profile = null;
        profile = profileService.getProfileDetails(id);
        return profile;
    }
}
