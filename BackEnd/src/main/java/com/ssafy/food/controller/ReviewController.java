package com.ssafy.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	// 리뷰 목록
	@GetMapping("/restaurant/reviewList")
	public ResponseEntity<?> list(@RequestBody Restaurant restaurant ) {
		List<Review> list = reviewService.selectAll(restaurant.getRes_Id());
		
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Review>>(list, HttpStatus.OK);
	}


	//등록
	@PostMapping("/restaurant/review") 
	public ResponseEntity<Review> write(@RequestBody Review review) {
		reviewService.insertReview(review);
		return new ResponseEntity<Review>(review, HttpStatus.CREATED);
	}

	//삭제
	@DeleteMapping("/restaurant/deletreview/{id}") 
	public ResponseEntity<String> delete(@RequestBody Review review) {
		if (reviewService.deleteReview(review))
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NOT_FOUND);
	}

	//업데이트
	@PutMapping("/restaurant/review/{id}") 
	public ResponseEntity<String> update(@RequestBody Review review ) {
		if (reviewService.updateReview(review))
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.BAD_REQUEST);
	}


}
