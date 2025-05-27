package com.hotel.spring.application.Repository;

import com.hotel.spring.application.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal,Long> {
}
