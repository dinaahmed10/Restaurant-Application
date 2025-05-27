package com.spring.restaurant.Service.ServiceImpl;


import com.spring.restaurant.Entity.Meal;
import com.spring.restaurant.Mapper.MealMapper;
import com.spring.restaurant.Repository.MealRepository;
import com.spring.restaurant.Service.MealService;
import com.spring.restaurant.DTO.MealDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class MealServiceImpl implements MealService {
     private MealRepository MealRepository;
    @Override
    public MealDTO createMeal(MealDTO MealDTO) {
        Meal meal= new Meal();
        meal.setName(MealDTO.getName());
        meal.setDescription(MealDTO.getDescription());
        Meal savedMeal=MealRepository.save(meal);


        return MealMapper.mapToMealDto(savedMeal);
    }

    @Override
    public MealDTO readMealByID(Long id) {
        Meal meal=MealRepository.findById(id).get();
        return MealMapper.mapToMealDto(meal) ;

    }

    @Override
    public MealDTO updateMeal(Long id, MealDTO MealDTO) {
        Meal oldMeal=MealRepository.findById(id).orElseThrow();
        oldMeal.setDescription(MealDTO.getDescription());
        oldMeal.setName(MealDTO.getName());
        MealRepository.save(oldMeal);
        return MealDTO;
    }

    @Override
    public List<MealDTO> getAllMeals() {
        List<MealDTO> MealDTOs = new ArrayList<>();
        for(int i=0;i < MealRepository.findAll().size();i++){
            MealDTO MealDTO =MealMapper.mapToMealDto(MealRepository.findAll().get(i));
            MealDTOs.add(MealDTO);
        }
        return MealDTOs ;
    }

    @Override
    public void deleteMeal(Long id) {
        MealRepository.deleteById(id);
    }
}
