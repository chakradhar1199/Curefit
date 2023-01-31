package com.chakri.curefit.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
public class Meal extends Basemodel{
    @ManyToOne
    private Users user;

    @ManyToOne
    private Food food;

    private int quantityConsumed;

    private int caloriesGained;
    private MealType mealType;
}
