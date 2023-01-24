package com.chakri.curefit.controllers;

import com.chakri.curefit.dto.CreateMealDto;
import com.chakri.curefit.models.Food;
import com.chakri.curefit.models.Meal;
import com.chakri.curefit.models.MealType;
import com.chakri.curefit.models.Users;
import com.chakri.curefit.services.FoodService;
import com.chakri.curefit.services.MealService;
import com.chakri.curefit.services.UserService;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class MealController {
    private Usercontroller usercontroller;
    private FoodController foodController;
    private MealService mealService;

    @GetMapping("/getmeal")
    public List<Meal> getMeal(){
        return mealService.getMeals();
    }

    // this method is to add the meal for user
    @PostMapping("/addmeal")
    public List<Meal> createMeal(@RequestBody CreateMealDto request){
        List<Meal> responseMeals = new ArrayList<>();
        for(int i=0;i<request.getFoodIds().size();i++){
            Users user = usercontroller.getUserById(request.getUserid());
            Food food = foodController.getFoodById(request.getFoodIds().get(i));
            int caloriePer100gms = foodController.getFoodById(request.getFoodIds().get(i)).getCaloriesPer100gms();
            int caloriesGained = (caloriePer100gms*request.getFoodQuantities().get(i))/100;
            responseMeals.add(mealService.createMeal(user,food,request.getFoodQuantities().get(i),caloriesGained,request.getMealType()));
        }
        return responseMeals;
    }


}
