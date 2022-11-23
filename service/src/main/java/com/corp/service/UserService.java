package com.corp.service;

import com.corp.dao.UserDao;
import com.corp.model.UserEntity;

import java.util.List;

public class UserService {

    private final UserDao userDao = new UserDao();

    public List<UserEntity> getAll() {
        return userDao.findAll();
    }
}
