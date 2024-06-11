package com.example.bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User{

    @Id
    private Long id;

    private String userId;
    private String password;
    private String username;
    private Long haveMoney;

}
