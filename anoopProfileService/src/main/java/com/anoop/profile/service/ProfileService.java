package com.anoop.profile.service;

import com.anoop.profile.entity.Profile;
import com.anoop.profile.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }
    public Profile getProfileDetails(int id)
    {
        return profileRepository.readProfileDetails(id);
    }
}
