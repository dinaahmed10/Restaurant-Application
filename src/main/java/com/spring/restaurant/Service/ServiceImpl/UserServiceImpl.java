package com.spring.restaurant.Service.ServiceImpl;


import com.spring.restaurant.Repository.UserRepository;
import com.spring.restaurant.Service.UserService;
import com.spring.restaurant.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
     private UserRepository userRepository;



    @Override
    public User createuser(User user) {
        return userRepository.save(user);
    }
}
