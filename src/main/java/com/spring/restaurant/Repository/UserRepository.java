package com.spring.restaurant.Repository;


import com.spring.restaurant.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
