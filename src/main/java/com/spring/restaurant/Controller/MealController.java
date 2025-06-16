package com.spring.restaurant.Controller;

import com.spring.restaurant.Service.MealService;
import com.spring.restaurant.DTO.MealDTO;
import com.spring.restaurant.execption.ErrorDetails;
import com.spring.restaurant.execption.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/meals")
@AllArgsConstructor
public class MealController{
    private MealService MealService;


    @GetMapping("/readListOfMeals")
    public ResponseEntity<List<MealDTO>> readListOfMeals(){
        return  ResponseEntity.ok(MealService.getAllMeals());
    }

    @GetMapping("/readMealByID/{id}")
    public ResponseEntity<MealDTO> getMealById(@PathVariable Long id){
        return ResponseEntity.ok(MealService.readMealByID(id));
    }

    @PostMapping("/createMeal")
    public ResponseEntity<MealDTO> creteMeal(@RequestBody MealDTO MealDTO){
        return new ResponseEntity<>(MealService.createMeal(MealDTO), HttpStatus.CREATED);
    }
    @PutMapping("/updateMeal/{id}")
    public ResponseEntity<MealDTO>  updateMeal(@PathVariable Long id, @RequestBody MealDTO MealDTO){
        return  ResponseEntity.ok(MealService.updateMeal(id,MealDTO));
    }

    @DeleteMapping("/deleteMeal/{id}")
    public ResponseEntity<Void>  deleteMeal(@PathVariable Long id){
        MealService.deleteMeal(id);
        return ResponseEntity.noContent().build();
    }






}
