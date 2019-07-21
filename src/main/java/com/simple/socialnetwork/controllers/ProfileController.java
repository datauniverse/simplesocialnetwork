package com.simple.socialnetwork.controllers;

import com.simple.socialnetwork.dao.ProfileDAO;
import com.simple.socialnetwork.models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "profile")
public class ProfileController {
    @Autowired
    private ProfileDAO profileDao;

    @GetMapping(produces = "application/json")
    public List<Profile> getProfiles() {
        return profileDao.getAllProfiles();
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<Void> addProfile(@RequestBody Profile profile) {
        Profile newProfile = profileDao.addProfile(profile);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newProfile.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
