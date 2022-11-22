package com.corp.dao;

import com.corp.model.UserEntity;

import java.util.List;

public class UserDao {

    public List<UserEntity> findAll() {
        return List.of(
                new UserEntity(11, "Ivan"),
                new UserEntity(22, "Petr"),
                new UserEntity(33, "Sveta")
        );
    }
}
