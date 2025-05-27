package com.spring.restaurant.Service.ServiceImpl;


import com.spring.restaurant.Repository.MealRepository;
import com.spring.restaurant.Service.MealService;
import com.spring.restaurant.entity.Meal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class MealServiceImpl implements MealService {
     private MealRepository MealRepository;
    @Override
    public Meal createMeal(Meal Meal) {
        return MealRepository.save(Meal);
    }
}
