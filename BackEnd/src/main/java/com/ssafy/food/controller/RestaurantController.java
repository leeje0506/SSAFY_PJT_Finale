package com.ssafy.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.food.model.dto.Restaurant;
import com.ssafy.food.model.dto.SearchCondition;
import com.ssafy.food.service.RestaurantService;

@RestController
@RequestMapping("/api")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	//목록
	@GetMapping("/restaurant")
	public ResponseEntity<?> list(SearchCondition condition) {
		List<Restaurant> list = restaurantService.search(condition);
		
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Restaurant>>(list, HttpStatus.OK);
	}

	// 상세
	@GetMapping("/restaurant/{id}")
	public ResponseEntity<Restaurant> detail(@PathVariable int id) {
		Restaurant restaurant = restaurantService.selectOne(id);
		if (restaurant != null)
			return new ResponseEntity<Restaurant>(restaurant, HttpStatus.OK);
		return new ResponseEntity<Restaurant>(HttpStatus.NOT_FOUND);
	}



}
