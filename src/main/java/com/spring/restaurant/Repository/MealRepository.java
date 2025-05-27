package com.spring.restaurant.Repository;

import com.spring.restaurant.Entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal,Long> {
}
