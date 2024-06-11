package com.example.bank.controller;

import com.example.bank.entity.User;
import com.example.bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @PostMapping("/join")
    public ResponseEntity<User> join(@RequestBody User user) {
        userService.Register(user);
        return ResponseEntity.ok(user);
    }
}
