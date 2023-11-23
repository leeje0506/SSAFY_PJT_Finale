package com.ssafy.food.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.food.model.dto.OptionInfo;
import com.ssafy.food.model.dto.Restaurant;
import com.ssafy.food.model.dto.Review;
import com.ssafy.food.model.dto.SearchCondition;
import com.ssafy.food.service.RestaurantService;
import com.ssafy.food.service.ReviewService;

@RestController
@RequestMapping("/api")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@Autowired
	private ReviewService reviewService;
	
	//목록
	@GetMapping("/restaurant")
	public ResponseEntity<?> list(OptionInfo optionInfo) {

		List<Restaurant> list = new ArrayList<Restaurant>();

		if (optionInfo.getFood() == null) {
			list = restaurantService.selectAll();
		}else{
			SearchCondition condition = new SearchCondition(optionInfo.getFood(), optionInfo.getAddress(), 0, 0, 0, 0, 0, 0, 0);
	
			if (optionInfo.getOption1().equals("무료주차")) {
				condition.setCon_Park(1);
			}else if (optionInfo.getOption1().equals("유아의자")) {
				condition.setCon_Kid(1);
			}else if (optionInfo.getOption1().equals("휠체어 대여")) {
				condition.setCon_Wheel(1);
			}else if (optionInfo.getOption1().equals("반려동물")) {
				condition.setCon_Pet(1);
			}
	
			if (optionInfo.getOption2().equals("채식메뉴")) {
				condition.setCon_Vegi(1);
			}else if (optionInfo.getOption2().equals("할랄메뉴")) {
				condition.setCon_Halal(1);
			}else if (optionInfo.getOption2().equals("글루텐프리메뉴")) {
				condition.setCon_GFree(1);
			}
	
			list = restaurantService.search(condition);
		}
		

	
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Restaurant>>(list, HttpStatus.OK);
	}

	// 상세
	@GetMapping("/restaurant/{id}")
	public ResponseEntity<Restaurant> detail(@PathVariable int id) {
		Restaurant restaurant = restaurantService.selectOne(id);
		List<Review> reviewList = reviewService.selectAll(id);
		
		if (reviewList.size() != 0 && reviewList != null) restaurant.setRes_Review(reviewList);

		if (restaurant != null)
			return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);
		return new ResponseEntity<Restaurant>(HttpStatus.NOT_FOUND);
	}



}
