package com.ssafy.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.food.model.dao.ReviewDao;
import com.ssafy.food.model.dto.Review;

public class ReviewServiceImpl implements ReviewService{
    @Autowired
    private ReviewDao ReviewDao;
    
    @Override
    public void insertReview(Review review) {
        ReviewDao.insertReview(review);
    }
    
    @Override
    public boolean deleteReview(int res_id, int rev_id) {
        return ReviewDao.deleteReview(res_id , rev_id) == 1;
    }


    @Override
    public List<Review> selectAll(int res_id) {
        return ReviewDao.selectAll(res_id);
    }

    
}