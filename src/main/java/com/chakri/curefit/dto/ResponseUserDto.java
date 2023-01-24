package com.chakri.curefit.dto;

import lombok.Builder;

@Builder
public class ResponseUserDto {
    private int weight;
    private int height;
    private String name;
    private String emailaddress;
    private String mobilNumber;
}
