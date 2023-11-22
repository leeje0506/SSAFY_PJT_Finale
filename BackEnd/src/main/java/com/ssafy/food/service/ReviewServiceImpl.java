package com.ssafy.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.food.model.dao.ReviewDao;
import com.ssafy.food.model.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService{
    @Autowired
    private ReviewDao ReviewDao;
    
    @Override
    public void insertReview(Review review) {
        ReviewDao.insertReview(review);
    }
    
    @Override
    public boolean deleteReview(Review review) {
        return ReviewDao.deleteReview(review) == 1;
    }


    @Override
    public List<Review> selectAll(int res_id) {
        return ReviewDao.selectAll(res_id);
    }

    @Override
    public boolean updateReview(Review review) {
        return ReviewDao.updateReview(review) == 1;
    }

    
}