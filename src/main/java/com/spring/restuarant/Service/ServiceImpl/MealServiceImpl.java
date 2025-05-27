package com.spring.restuarant.Service.ServiceImpl;


import com.spring.restuarant.Repository.MealRepository;
import com.spring.restuarant.Service.MealService;
import com.spring.restuarant.entity.Meal;
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
