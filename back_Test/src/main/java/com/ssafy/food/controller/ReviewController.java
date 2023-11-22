package com.ssafy.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.food.model.dto.Restaurant;
import com.ssafy.food.model.dto.Review;
import com.ssafy.food.service.ReviewService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class ReviewController {
    private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

    @Autowired
    private ReviewService reviewService;

	//등록
	@PostMapping("/restaurant/review") 
	public ResponseEntity<Review> write(@RequestBody Review review) {
		reviewService.insertReview(review);
		return new ResponseEntity<Review>(review, HttpStatus.CREATED);
	}

	//삭제
	@DeleteMapping("/restaurant/review/{id}") 
	public ResponseEntity<String> delete(@RequestBody Restaurant restaurant , @PathVariable int id) {
		if (reviewService.deleteReview(restaurant.getRes_Id(), id))
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NOT_FOUND);
	}


}
