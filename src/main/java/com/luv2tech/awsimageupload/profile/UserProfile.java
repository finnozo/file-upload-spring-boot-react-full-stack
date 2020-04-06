package com.luv2tech.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;


public class UserProfile {
    private UUID userProfileId;
    private String userName;
    private String userProfileImageLink; // s3 key

    public UserProfile(UUID userProfileId, String userName, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.userName = userName;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId) {
        this.userProfileId = userProfileId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProfile)) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(getUserProfileId(), that.getUserProfileId()) &&
                Objects.equals(getUserName(), that.getUserName()) &&
                Objects.equals(getUserProfileImageLink(), that.getUserProfileImageLink());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserProfileId(), getUserName(), getUserProfileImageLink());
    }
}
