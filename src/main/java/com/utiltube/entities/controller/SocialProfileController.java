package com.utiltube.entities.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technobitia.search.model.SocialProfile;

@RestController
@RequestMapping(value = "/socialprofile")
public class SocialProfileController {
    
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public SocialProfile discoveerEntity(@PathVariable String name) {
        SocialProfile socialProfile = new SocialProfile();
        return  socialProfile;
    }
}
