package com.chakri.curefit.repositories;

import com.chakri.curefit.models.Food;
import com.chakri.curefit.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
