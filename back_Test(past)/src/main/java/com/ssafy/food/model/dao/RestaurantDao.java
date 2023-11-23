package com.ssafy.food.model.dao;

import java.util.List;

import com.ssafy.food.model.dto.Restaurant;
import com.ssafy.food.model.dto.SearchCondition;

public interface RestaurantDao {
    public Restaurant selectOne(int id);

    public List<Restaurant> search(SearchCondition condition);
}
