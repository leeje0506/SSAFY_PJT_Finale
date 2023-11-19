package com.ssafy.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ssafy.food.model.dto.Review;
import com.ssafy.food.service.ReviewService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class ReviewController {
    private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

    @Autowired
    ReviewService reviewService;

    //  restaurant와 겹쳐지면?? 
    @GetMapping("/restaurant/{id}/") 
	public ResponseEntity<?> list(@PathVariable int id) {
		List<Review> list = reviewService.selectAll(id);
		
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Review>>(list, HttpStatus.OK);
	}

	//등록
	@PostMapping("/restaurant/{id}/review")
	public ResponseEntity<Review> write(@RequestBody Review review) {
		reviewService.insertReview(review);
		return new ResponseEntity<Review>(review, HttpStatus.CREATED);
	}

	//삭제
	@DeleteMapping("/restaurant/{id}/review/{rev_id}") 
	public ResponseEntity<String> delete(@PathVariable int id , @PathVariable int rev_id) {
		if (reviewService.deleteReview(id, rev_id))
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		return new ResponseEntity<String>(FAIL, HttpStatus.NOT_FOUND);
	}


}
