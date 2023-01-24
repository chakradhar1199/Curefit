package com.chakri.curefit.dto;

import com.chakri.curefit.models.Users;
import lombok.Getter;

@Getter
public class CreateUserDto {
    private long mobileNumber;
    private String name;
    private String emailAddress;
    private int weight;
    private int height;
    private String Password;

    public Users toUser(){
        return Users.builder()
                .setMobileNumber(mobileNumber)
                .setPassword(Password)
                .setName(name)
                .setWeight(weight)
                .setHeight(height)
                .setEmailAddress(emailAddress)
                .build();
    }
}
