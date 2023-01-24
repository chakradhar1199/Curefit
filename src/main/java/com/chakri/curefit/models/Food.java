package com.chakri.curefit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data

@AllArgsConstructor
@ToString
@Builder
public class Food extends Basemodel{
    private int caloriesPer100gms;
    private String name;

    public Food() {
    }

//    public static FoodBuilder builder(){
//        return new FoodBuilder();
//    }
//    public static class FoodBuilder{
//        private int caloriesPer100gms;
//        private String name;
//
//        public FoodBuilder CaloriesPer100gms(int caloriesPer100gms) {
//            this.caloriesPer100gms = caloriesPer100gms;
//            return this;
//        }
//
//        public FoodBuilder Name(String name) {
//            this.name = name;
//            return this;
//        }
//
//        public Food build(){
//            Food food = new Food();
//            food.caloriesPer100gms = caloriesPer100gms;
//            food.name = name;
//            return food;
//        }
//    }
}
