package com.chakri.curefit.services;

import com.chakri.curefit.dto.CreateFoodDto;
import com.chakri.curefit.models.Food;
import com.chakri.curefit.repositories.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoodService {
    private FoodRepository foodRepository;

    public Food createFood(Food food){
        return foodRepository.save(food);
    }

    public Food getFoodById(Long id){
        return foodRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }


}
