package com.ssafy.food.model.dao;
import com.ssafy.food.model.dto.User;
import java.util.List;

public interface UserDao {

    List<User> selectAll();
    int insertUser(User user);
	User selectOne(String id);
    User login(User user);
}