package com.corp.service;

import com.corp.model.UserEntity;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void getAll() {
        List<UserEntity> actual = userService.getAll();
        assertEquals(3, actual.size());
    }
}