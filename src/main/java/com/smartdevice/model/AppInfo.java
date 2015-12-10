package com.smartdevice.model;

import java.util.Date;

public class AppInfo {

    private Long id;

    private String appName;

    private String publisher;

    private Date pubTime;

    private String picture;

    private String path;

    private String deviceType;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getAppName() {
        return appName;
    }

    public void setAppname(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Date getpubTime() {
        return pubTime;
    }


    public void setpubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }


    public String getPath() {
        return path;
    }


    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}