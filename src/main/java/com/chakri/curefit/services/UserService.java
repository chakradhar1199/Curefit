package com.chakri.curefit.services;

import com.chakri.curefit.dto.CreateUserDto;
import com.chakri.curefit.models.Users;
import com.chakri.curefit.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    public Users createUser(CreateUserDto request){
        Users user = request.toUser();
        return userRepository.save(user);
    }

    public List<Users> getUsers(){
        System.out.println(userRepository.findAll());
        return userRepository.findAll();
    }


    public Users getUser(Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
