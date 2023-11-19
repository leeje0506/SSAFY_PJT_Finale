package com.ssafy.food.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.food.model.dao.UserDao;
import com.ssafy.food.model.dto.User;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override       
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public User selectOne(String id) {
        return userDao.selectOne(id);
    }



    
}