package com.spring.restaurant.Service.ServiceImpl;


import com.spring.restaurant.Repository.UserRepository;
import com.spring.restaurant.Service.UserService;
import com.spring.restaurant.Entity.User;
import com.spring.restaurant.execption.EmailAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
     private UserRepository userRepository;



    @Override
    public User createuser(User user) {
        Optional<User> optionalUser=userRepository.findByEmail(user.getEmail());
        if(optionalUser.isPresent()){
            throw new EmailAlreadyExistsException("Email already exists for a user");
        }
        return userRepository.save(user);
    }
}
