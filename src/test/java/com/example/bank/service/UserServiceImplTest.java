package com.example.bank.service;

import com.example.bank.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    void userSave() {
        User testUser = User.builder()
                .id(1L)
                .userId("testId")
                .password("password")
                .username("testName")
                .haveMoney(1000L)
                .build();

        userService.Register(testUser);

        Optional<User> findUser = userService.UserFindId(1L);

        assertTrue(findUser.isPresent());
        assertEquals(testUser.getUserId(), findUser.get().getUserId());
        assertEquals(testUser.getPassword(), findUser.get().getPassword());
        assertEquals(testUser.getUsername(), findUser.get().getUsername());
        assertEquals(testUser.getHaveMoney(), findUser.get().getHaveMoney());
    }
}