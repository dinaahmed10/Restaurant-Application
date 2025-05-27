package com.spring.restaurant.Service.ServiceImpl;


import com.spring.restaurant.Repository.MealRepository;
import com.spring.restaurant.Service.MealService;
import com.spring.restaurant.entity.Meal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class MealServiceImpl implements MealService {
     private MealRepository MealRepository;
    @Override
    public Meal createMeal(Meal Meal) {
        return MealRepository.save(Meal);
    }

    @Override
    public Meal readMealByID(Long id) {
        return MealRepository.findById(id).get();
    }

    @Override
    public Meal updateMeal(Long id, Meal meal) {
        Meal oldMeal=MealRepository.findById(id).orElseThrow();
        oldMeal.setDescription(meal.getDescription());
        oldMeal.setName(meal.getName());
        return MealRepository.save(oldMeal);
    }

    @Override
    public List<Meal> getAllMeals() {
        return MealRepository.findAll();
    }

    @Override
    public void deleteMeal(Long id) {
        MealRepository.deleteById(id);
    }
}
