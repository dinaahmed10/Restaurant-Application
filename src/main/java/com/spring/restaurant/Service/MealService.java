package com.spring.restaurant.Service;


import com.spring.restaurant.entity.Meal;

import java.util.List;

public interface MealService {

    Meal createMeal(Meal meal);
    Meal readMealByID(Long id);
    Meal updateMeal(Long id, Meal meal);
    List<Meal> getAllMeals();
    void deleteMeal(Long id);

}
