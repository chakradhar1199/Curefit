package com.chakri.curefit.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;


@Getter
public enum MealType {
    BreakFast("breakfast"),
    Lunch("lunch"),
    Dinner("dinner"),
    PreWorkout("preworkout"),
    PostWorkout("postworkout"),
    Snacks("snacks");

    private String mealType;

    MealType(String mealType) {
        this.mealType = mealType;
    }

    public static MealType fromString(String text) {
        for (MealType b : MealType.values()) {
            if (b.mealType.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
