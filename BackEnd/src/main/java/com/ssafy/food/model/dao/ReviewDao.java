package com.ssafy.food.model.dao;

import java.util.List;

import com.ssafy.food.model.dto.Review;

public class ReviewDao {
    void insertReview(Review review);
    List<Review> selectAll();
}
