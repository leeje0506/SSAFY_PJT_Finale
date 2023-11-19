package com.ssafy.food.model.dao;

import com.ssafy.food.model.dto.User;

public interface UserDao {
    void insertUser(User user);
	User selectOne(String id);
}