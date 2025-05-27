package com.spring.restuarant.Service.ServiceImpl;


import com.spring.restuarant.Repository.UserRepository;
import com.spring.restuarant.Service.UserService;
import com.spring.restuarant.entity.User;
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
