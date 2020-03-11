package com.stutuncu.twiliosms.controller;


import com.stutuncu.twiliosms.entity.User;
import com.stutuncu.twiliosms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String ekle(){
        User user =new User();
        user.setDescription("deneme");
        user.setTitle("deneme");
        userRepository.save(user);
        return "calisti";

    }
    @GetMapping("/getall")
    public ResponseEntity<List<User>> getAll(){

        return ResponseEntity.ok(userRepository.findAll());
    }

}
