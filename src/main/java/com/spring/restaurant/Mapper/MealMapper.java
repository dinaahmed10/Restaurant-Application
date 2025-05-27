package com.spring.restaurant.Mapper;

import com.spring.restaurant.DTO.MealDTO;
import com.spring.restaurant.Entity.Meal;

public class MealMapper {
    public static MealDTO mapToMealDto(Meal meal){
        return new MealDTO(
                meal.getId(),
                meal.getName(),
                meal.getDescription()

        );
    }

    public static Meal mapToMeal(MealDTO mealDTO){
        return new Meal(
                mealDTO.getId(),
                mealDTO.getName(),
                mealDTO.getDescription()
        );
    }
}
