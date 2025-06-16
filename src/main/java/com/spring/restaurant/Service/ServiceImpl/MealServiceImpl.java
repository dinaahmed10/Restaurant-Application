package com.spring.restaurant.Service.ServiceImpl;


import com.spring.restaurant.Entity.Meal;
import com.spring.restaurant.Mapper.MealMapper;
import com.spring.restaurant.Repository.MealRepository;
import com.spring.restaurant.Service.MealService;
import com.spring.restaurant.DTO.MealDTO;
import com.spring.restaurant.execption.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class MealServiceImpl implements MealService {
     private MealRepository MealRepository;
     private ModelMapper ModelMapper;

    @Override
    public MealDTO createMeal(MealDTO MealDTO) {

          ////  WithoutMapper   /////
/*        Meal meal= new Meal();
//        meal.setName(MealDTO.getName());
//        meal.setDescription(MealDTO.getDescription());
//        Meal savedMeal=MealRepository.save(meal);
//        return MealMapper.mapToMealDto(savedMeal);
*/

              ////  ManualMapper   /////
//            Meal meal = MealMapper.mapToMeal(MealDTO);  // Use mapper for conversion
//            Meal savedMeal = MealRepository.save(meal); // Follow Java naming conventions
//            return MealMapper.mapToMealDto(savedMeal);


            ////  ModelMapper   /////
            Meal meal =ModelMapper.map(MealDTO,Meal.class);
            Meal savedMeal = MealRepository.save(meal);
            return ModelMapper.map(savedMeal,MealDTO.class);




    }

    @Override
    public MealDTO readMealByID(Long id) {
        Meal meal=MealRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("User","ID",id));
      //  return MealMapper.mapToMealDto(meal) ;
        return ModelMapper.map(meal,MealDTO.class);
    }

    @Override
    public MealDTO updateMeal(Long id, MealDTO MealDTO) {
//        Meal oldMeal=MealRepository.findById(id).orElseThrow();
//        oldMeal.setDescription(MealDTO.getDescription());
//        oldMeal.setName(MealDTO.getName());
//        MealRepository.save(oldMeal);
//        return MealDTO;


//        Meal existingMeal=MealRepository.findById(id).orElseThrow();
//
//        Meal updatedMeal=MealMapper.mapToMeal(MealDTO);
//        updatedMeal.setId(existingMeal.getId());
//
//        Meal savedMeal=MealRepository.save(updatedMeal);
//
//        return MealMapper.mapToMealDto(savedMeal);


        Meal existingMeal=MealRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("User","ID",id));

        Meal updatedMeal=ModelMapper.map(MealDTO ,Meal.class);
        updatedMeal.setId(existingMeal.getId());

        Meal savedMeal=MealRepository.save(updatedMeal);

        return ModelMapper.map(savedMeal, MealDTO.class);
    }

    @Override
    public List<MealDTO> getAllMeals() {
        List<MealDTO> MealDTOs = new ArrayList<>();
        for(int i=0;i < MealRepository.findAll().size();i++){
            MealDTO MealDTO =ModelMapper.map(MealRepository.findAll().get(i) , MealDTO.class);
            MealDTOs.add(MealDTO);
        }
        return MealDTOs ;
    }

    @Override
    public void deleteMeal(Long id) {
        MealRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("User","ID",id));
        MealRepository.deleteById(id);
    }
}
