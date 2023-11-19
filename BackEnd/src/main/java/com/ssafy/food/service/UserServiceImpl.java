package com.ssafy.food.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.food.model.dao.UserDao;
import com.ssafy.food.model.dto.User;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override       //void로 두면 안될것 같은데 아닌가 컨트롤러에서 처리를 하면 되려나
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public User selectOne(String id) {
        return userDao.selectOne(id);
    }



    
}