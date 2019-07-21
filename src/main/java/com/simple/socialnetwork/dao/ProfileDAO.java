package com.simple.socialnetwork.dao;

import com.simple.socialnetwork.models.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfileDAO {
    private static List<Profile> profiles = new ArrayList<>();

    static {
        profiles.add(new Profile(1, "John Smith", "1990-01-01", "Bangalore", "India"));
    }

    public List<Profile> getAllProfiles() {
        return profiles;
    }

    public Profile addProfile(Profile profile) {
        if (profiles.size() == 0) profile.setId(1);
        else profile.setId(profiles.size() + 1);
        profiles.add(profile);
        return profile;
    }
}
