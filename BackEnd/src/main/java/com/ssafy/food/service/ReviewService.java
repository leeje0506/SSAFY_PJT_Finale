package com.ssafy.food.service;

import java.util.List;

import com.ssafy.food.model.dto.Review;

public interface ReviewService  {
    void insertReview(Review review);
    boolean deleteReview(int res_id , int rev_id);
    List<Review> selectAll(int res_id);
}