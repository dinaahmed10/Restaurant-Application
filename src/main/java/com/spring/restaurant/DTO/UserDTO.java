package com.spring.restaurant.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDTO {
    @NotNull(message = "firstName is required")
    @NotEmpty(message = "firstName cannot be empty")
    @NotBlank(message = "firstName cannot be blank")
    private String firstName;
    @NotNull(message = "lastName is required")
    @NotEmpty(message = "lastName cannot be empty")
    @NotBlank(message = "lastName cannot be blank")
    private String lastName;
    @Email(message = "Invalid email address")
    private String email;
}
