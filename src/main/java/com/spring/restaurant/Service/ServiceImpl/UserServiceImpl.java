package com.spring.restaurant.Service.ServiceImpl;


import com.spring.restaurant.DTO.UserDTO;
import com.spring.restaurant.Repository.UserRepository;
import com.spring.restaurant.Service.UserService;
import com.spring.restaurant.Entity.User;
import com.spring.restaurant.execption.EmailAlreadyExistsException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
     private UserRepository userRepository;
     private  ModelMapper modelMapper;



    @Override
    public UserDTO createuser(UserDTO user) {
        Optional<User> optionalUser=userRepository.findByEmail(user.getEmail());
        if(optionalUser.isPresent()){
            throw new EmailAlreadyExistsException("Email already exists for a user");
        }
        User savedUser=userRepository.save(modelMapper.map(user ,User.class));
        return modelMapper.map(savedUser ,UserDTO.class);

    }
}
