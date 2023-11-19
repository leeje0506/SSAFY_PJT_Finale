package com.ssafy.food.model.dao;

import java.util.List;

import com.ssafy.food.model.dto.Review;

public interface ReviewDao {
    void insertReview(Review review);
    int deleteReview(int id);
    List<Review> selectAll(int res_id);
}
