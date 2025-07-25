package com.spring.restaurant.Controller;


import com.spring.restaurant.DTO.UserDTO;
import com.spring.restaurant.Service.UserService;
import com.spring.restaurant.Entity.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@Valid @RequestBody UserDTO user){
        UserDTO userSaved= userService.createuser(user);
        return new ResponseEntity<>(userSaved, HttpStatus.CREATED);
    }

}
