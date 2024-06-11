package com.example.bank.service;

import com.example.bank.entity.User;

import java.util.Optional;

public interface UserService {

    User Register(User user);

    Optional<User> UserFindId(Long id);

    User Login(User user);
}
