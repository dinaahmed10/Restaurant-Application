package com.spring.restaurant.Repository;

import com.spring.restaurant.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal,Long> {
}
