package com.chakri.curefit.repositories;

import com.chakri.curefit.models.Meal;
import com.chakri.curefit.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
}
