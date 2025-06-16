package com.spring.restaurant.execption;


import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
   private LocalDateTime timestamp;
    private String message;
    private String path;
    private String errorCode;
}
