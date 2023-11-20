package com.ssafy.food.service;
import com.ssafy.food.model.dto.User;
import java.util.List;

public interface UserService {

    List<User> getUserList();
    int insertUser(User user);
	User selectOne(String id);
    User login(User user);
}