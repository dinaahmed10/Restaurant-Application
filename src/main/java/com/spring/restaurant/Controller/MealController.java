package com.spring.restaurant.Controller;

import com.spring.restaurant.Service.MealService;
import com.spring.restaurant.entity.Meal;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/meals")
@AllArgsConstructor
public class MealController{
    private MealService MealService;


    @GetMapping("/readListOfMeals")
    public ResponseEntity<List<Meal>> readListOfMeals(){
        return  ResponseEntity.ok(MealService.getAllMeals());
    }

    @GetMapping("/readMealByID/{id}")
    public ResponseEntity<Meal> getMealById(@PathVariable Long id){
        return ResponseEntity.ok(MealService.readMealByID(id));
    }

    @PostMapping("/createMeal")
    public ResponseEntity<Meal> creteMeal(@RequestBody Meal Meal){
        return new ResponseEntity<>(MealService.createMeal(Meal), HttpStatus.CREATED);
    }
    @PutMapping("/updateMeal/{id}")
    public ResponseEntity<Meal>  updateMeal(@PathVariable Long id, @RequestBody Meal Meal){
        return  ResponseEntity.ok(MealService.updateMeal(id,Meal));
    }

    @DeleteMapping("/deleteMeal/{id}")
    public ResponseEntity<Void>  deleteMeal(@PathVariable Long id){
        MealService.deleteMeal(id);
        return ResponseEntity.noContent().build();
    }




}
