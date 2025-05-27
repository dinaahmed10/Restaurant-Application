package com.hotel.spring.application.Service.ServiceImpl;


import com.hotel.spring.application.Repository.UserRepository;
import com.hotel.spring.application.Service.UserService;
import com.hotel.spring.application.entity.User;
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
