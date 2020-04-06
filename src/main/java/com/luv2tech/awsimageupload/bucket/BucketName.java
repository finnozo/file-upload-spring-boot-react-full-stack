package com.luv2tech.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("luv2tech-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
