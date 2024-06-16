package com.example.bank.service;

import com.example.bank.dto.LoginDTO;
import com.example.bank.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface UserService {

    User Register(User user);

    Optional<User> UserFindId(Long id);

    ResponseEntity<LoginDTO> Login(LoginDTO loginDTO);
}
