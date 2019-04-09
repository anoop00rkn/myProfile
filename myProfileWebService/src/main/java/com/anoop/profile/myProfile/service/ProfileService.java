package com.anoop.profile.myProfile.service;

import com.anoop.profile.myProfile.outDto.Profile;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class ProfileService {

    private final RestTemplate restTemplate;

    public ProfileService(RestTemplate restTemplate){
        this.restTemplate= restTemplate;
    }

    public Profile get(int id){
        String url= "http://localhost:8081/getProfileDetails/"+id;
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        return restTemplate.exchange(url, HttpMethod.GET, entity, Profile.class).getBody();
    }
}
