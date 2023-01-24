package com.chakri.curefit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
public enum MealType {
    BreakFast("BreakFast"),
    Lunch("Lunch"),
    Dinner("Dinner"),
    PreWorkout("PreWorkout"),
    PostWorkout("PostWorkout"),
    Snacks("Snacks");

    String mealType;

    MealType(String mealType) {
        this.mealType = mealType;
    }

//    public static MealType fromStringToEnum(String mealType){
//        if(!mealType.equals(null)){
//            for(MealType m: MealType.values()){
//                if
//            }
//        }
//    }
}
