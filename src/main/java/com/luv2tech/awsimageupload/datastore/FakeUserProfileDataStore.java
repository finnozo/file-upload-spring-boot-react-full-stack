package com.luv2tech.awsimageupload.datastore;

import com.luv2tech.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES =
            new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("0a7020f2-d84f-415e-8946-447c7772cffe"), "sushildangi", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("42c0cef0-7772-440d-ab8d-79450e23d904"),"skdjunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
