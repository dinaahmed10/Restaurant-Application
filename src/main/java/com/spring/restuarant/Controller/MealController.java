package com.spring.restuarant.Controller;

import com.spring.restuarant.Service.MealService;
import com.spring.restuarant.entity.Meal;
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

    @GetMapping("/readMeal")
    public Meal getMeal(){
        return new Meal(1L,"cook","cook is available",9897865) ;
    }

    @GetMapping("/readListOfMeals")
    public ResponseEntity<List<Meal>> readListOfMeals(){
        ArrayList<Meal> meals=new ArrayList<>();
        Meal meal1=new Meal(1L,"hwqkhv","hwqkhv is available",9897865);
        meals.add(meal1);
        MealService.createMeal(meal1);
        Meal Hotel2=new Meal(2L,"boos;l;k","boos;l;k is available",98965);
        meals.add(Hotel2);
        MealService.createMeal(Hotel2);
        Meal meal3=new Meal(3L,"s;kj;","s;kj; is available",98956325);
        meals.add(meal3);
        MealService.createMeal(meal3);

        return  ResponseEntity.ok(meals);
    }

    @GetMapping("/readMealByID/{id}")
    public ResponseEntity<Meal> getMealById(@PathVariable Long id){
        return ResponseEntity.ok( new Meal(1L,"cook","cook is available",9897865) );
    }

    @PostMapping("/createMeal")
    public ResponseEntity<Meal> creteMeal(@RequestBody Meal Meal){
        return new ResponseEntity<>(MealService.createMeal(Meal), HttpStatus.CREATED);
    }
    @PutMapping("/updateMeal/{id}")
    public ResponseEntity<Meal>  updateMeal(@PathVariable Long id, @RequestBody Meal Meal){
        return  ResponseEntity.ok(Meal);
    }

    @DeleteMapping("/deleteMeal/{id}")
    public ResponseEntity<Void>  deleteMeal(@PathVariable Long id){
        return ResponseEntity.noContent().build();
    }




}
