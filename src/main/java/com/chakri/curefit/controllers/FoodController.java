package com.chakri.curefit.controllers;


import com.chakri.curefit.dto.CreateFoodDto;
import com.chakri.curefit.models.Food;
import com.chakri.curefit.services.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoodController {

    private FoodService foodService;

    @PostMapping("/food")
    public Food createFood(@RequestBody CreateFoodDto request){
        return foodService.createFood(request.toFood());
    }

    @GetMapping("/food/{id}")
    public Food getFoodById(@PathVariable Long id){
        return foodService.getFoodById(id);
    }

    @GetMapping("/foods")
    public List<Food> getAllFoods(){
        return  foodService.getAllFoods();
    }

}
