package com.luv2tech.awsimageupload.profile;

import com.luv2tech.awsimageupload.datastore.FakeUserProfileDataStore;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final FakeUserProfileDataStore userProfileDataStore;

    public UserProfileDataAccessService(FakeUserProfileDataStore userProfileDataStore) {
        this.userProfileDataStore = userProfileDataStore;
    }

    List<UserProfile> getUserProfiles() {
        return userProfileDataStore.getUserProfiles();
    }
}
