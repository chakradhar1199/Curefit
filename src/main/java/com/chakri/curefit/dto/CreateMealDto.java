package com.chakri.curefit.dto;

import com.chakri.curefit.models.Food;
import com.chakri.curefit.models.Meal;
import com.chakri.curefit.models.MealType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class CreateMealDto {
    private Long userid;
    private List<Long> foodIds;
    private List<Integer> foodQuantities;
    private String mealType;


}
