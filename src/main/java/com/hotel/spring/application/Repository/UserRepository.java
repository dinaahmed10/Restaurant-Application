package com.hotel.spring.application.Repository;


import com.hotel.spring.application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
