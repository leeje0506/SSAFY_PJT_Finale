package com.ssafy.food.service;

public interface UserService {
    void insertUser(User user);
	User selectOne(String id);
}