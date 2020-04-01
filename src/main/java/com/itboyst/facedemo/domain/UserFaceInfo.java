package com.itboyst.facedemo.domain;


import lombok.Data;

import java.util.Date;

@Data
public class UserFaceInfo {

    private Integer id;

    private Integer groupId;

    private String faceId;

    private String name;

    private Integer age;

    private String email;

    private Short gender;

    private String phoneNumber;

    private Date createTime;

    private Date updateTime;

    private byte[] faceFeature;


    public void setName(String name) {
        this.name = name;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public void setFaceFeature(byte[] faceFeature) {
        this.faceFeature = faceFeature;
    }

    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }
}

