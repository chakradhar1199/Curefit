package com.chakri.curefit.dto;

import com.chakri.curefit.models.Food;
import lombok.Builder;

@Builder
public class CreateFoodDto {
    private int caloriesPer100gms;
    private String name;


    public Food toFood(){
        return Food.builder()
                .caloriesPer100gms(caloriesPer100gms)
                .name(name)
                .build();
    }

}
