package com.chakri.curefit.controllers;

import com.chakri.curefit.dto.CreateUserDto;
import com.chakri.curefit.dto.ResponseUserDto;
import com.chakri.curefit.models.Users;
import com.chakri.curefit.services.UserService;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class Usercontroller {
    private UserService userService;

    @PostMapping("/users")
    public Users createUsers(@RequestBody CreateUserDto request){
        //validate
        validate(request);
        return userService.createUser(request);
    }

    @GetMapping("/allusers")
    public List<Users> getUsers(){

        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public Users getUserById(@PathVariable Long id){
        return userService.getUser(id);
    }

    public void validate(CreateUserDto request) throws InvalidParameterException {
        if(request.getName() == null)
            throw new InvalidParameterException("Name cannot be null");
        else if (request.getEmailAddress() == null) {
            throw new InvalidParameterException("email cannot be null");
        }

    }
}
