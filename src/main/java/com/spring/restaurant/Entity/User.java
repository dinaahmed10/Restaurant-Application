package com.spring.restaurant.Entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull(message = "firstName is required")
    @NotEmpty(message = "firstName cannot be empty")
    @NotBlank(message = "firstName cannot be blank")
    private String firstName;
    @Column(nullable = false)
    @NotNull(message = "lastName is required")
    @NotEmpty(message = "lastName cannot be empty")
    @NotBlank(message = "lastName cannot be blank")
    private String lastName;
    @Column(nullable = false,unique = true)
    @Email(message = "Invalid email address")
    private String email;
}
