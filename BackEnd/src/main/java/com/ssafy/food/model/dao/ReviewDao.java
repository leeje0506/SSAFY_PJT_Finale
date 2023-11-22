package com.ssafy.food.model.dao;

import java.util.List;

import com.ssafy.food.model.dto.Review;

public interface ReviewDao {
    void insertReview(Review review);
    int deleteReview(Review review);
    int updateReview(Review review);
    List<Review> selectAll(int Res_id);
}
