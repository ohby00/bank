package com.example.bank.service;

import com.example.bank.entity.User;
import com.example.bank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User Register(User user) {
       return userRepository.save(user);
    }

    @Override
    public Optional<User> UserFindId(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User Login(User user) {
        return null;
    }
}
