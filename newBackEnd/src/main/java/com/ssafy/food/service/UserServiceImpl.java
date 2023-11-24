package com.ssafy.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.food.model.dao.UserDao;
import com.ssafy.food.model.dto.User;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override       
    public int insertUser(User user) {
       return userDao.insertUser(user);
    }

    @Override
    public User selectOne(String id) {
        return userDao.selectOne(id);
    }

    @Override
    public List<User> getUserList() {
        return userDao.selectAll();
    }

    @Override
	public User login(User user) {
		//DB 해당 ID만 넘겨서 데이터를 가지고 오고 가지고온 User 데이터와 내가 현재 가지고 있는 user의 비밀번호를 확인하면
		User tmp = userDao.selectOne(user.getUserId());
		//tmp가 실제 User 정보 일수도 있고 / null 넘어왔다.
		if(tmp != null && tmp.getUserPass().equals(user.getUserPass()))
			return tmp;
		return null;
	}

    
}