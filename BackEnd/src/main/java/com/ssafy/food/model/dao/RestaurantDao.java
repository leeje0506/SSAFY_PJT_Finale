package com.ssafy.food.model.dao;

import java.util.List;

import com.ssafy.food.model.dto.Restaurant;

public interface RestaurantDao {
    List<Restaurant> selectAll();

    public Restaurant selectOne(int id);

    public List<Restaurant> search(SearchCondition condition);
}
