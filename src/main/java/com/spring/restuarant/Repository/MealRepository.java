package com.spring.restuarant.Repository;

import com.spring.restuarant.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal,Long> {
}
