package com.ssafy.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.food.model.dao.RestaurantDao;
import com.ssafy.food.model.dto.Restaurant;
import com.ssafy.food.model.dto.SearchCondition;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    
    @Autowired
    private RestaurantDao restaurantDao;

    @Override
    public Restaurant selectOne(int id) {
        return restaurantDao.selectOne(id);
    }

    @Override
    public List<Restaurant> search(SearchCondition condition) {
        return restaurantDao.search(condition);
    }

}