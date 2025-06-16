package com.spring.restaurant.execption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private String resourceName;
    private String filedName;
    private Long fieldValue;
    public ResourceNotFoundException(String resourceName, String filedName, Long fieldValue){
     super(String.format( "%s not found with %s:%s",resourceName,filedName,fieldValue));
     this.resourceName=resourceName;
     this.filedName=filedName;
     this.fieldValue =fieldValue;
    }
}
