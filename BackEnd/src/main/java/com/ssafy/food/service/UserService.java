package com.ssafy.food.service;

import com.ssafy.food.model.dto.User;

public interface UserService {
    void insertUser(User user);
	User selectOne(String id);
}