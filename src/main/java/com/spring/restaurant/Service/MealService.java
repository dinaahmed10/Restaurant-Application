package com.spring.restaurant.Service;


import com.spring.restaurant.DTO.MealDTO;

import java.util.List;

public interface MealService {

    MealDTO createMeal(MealDTO MealDTO);
    MealDTO readMealByID(Long id);
    MealDTO updateMeal(Long id, MealDTO MealDTO);
    List<MealDTO> getAllMeals();
    void deleteMeal(Long id);

}
