package com.hotel.spring.application.Service.ServiceImpl;

import com.hotel.spring.application.Service.MealService;
import com.hotel.spring.application.Repository.MealRepository;
import com.hotel.spring.application.entity.Meal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class MealServiceImpl implements MealService {
     private MealRepository hotelRepository;
    @Override
    public Meal createMeal(Meal Meal) {
        return hotelRepository.save(Meal);
    }
}
