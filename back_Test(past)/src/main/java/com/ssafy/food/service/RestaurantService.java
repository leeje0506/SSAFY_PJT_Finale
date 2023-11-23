package com.ssafy.food.service;

import java.util.List;

import com.ssafy.food.model.dto.Restaurant;
import com.ssafy.food.model.dto.SearchCondition;

public interface RestaurantService{
    public Restaurant selectOne(int id);

    public List<Restaurant> search(SearchCondition condition);
}