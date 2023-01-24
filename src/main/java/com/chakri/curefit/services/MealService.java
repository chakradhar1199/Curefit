package com.chakri.curefit.services;

import com.chakri.curefit.models.Food;
import com.chakri.curefit.models.Meal;
import com.chakri.curefit.models.MealType;
import com.chakri.curefit.models.Users;
import com.chakri.curefit.repositories.MealRepository;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MealService {
    private MealRepository mealRepository;

    public List<Meal> getMeals(){
        return mealRepository.findAll();

    }
    public Meal createMeal(Users user, Food food, int quantityConsumed, int caloriesGained, String mealType){

        Meal meal = new Meal();
        meal.setUser(user);
        meal.setMealType(mealType);
        meal.setQuantityConsumed(quantityConsumed);
        meal.setCaloriesGained(caloriesGained);
        meal.setFood(food);
        return mealRepository.save(meal);
    }
}
