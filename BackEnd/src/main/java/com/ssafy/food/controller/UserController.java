package com.ssafy.food.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.food.model.dto.User;
import com.ssafy.food.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api")
public class UserController {
    

    	
	//UserService 주입
	@Autowired
	private UserService userService;
	
	//전체 유저 가져오기
	@GetMapping("/users")
	public List<User> userList() {
		return userService.getUserList();
	}
	
	//회원가입 
	@PostMapping("/user")
	public ResponseEntity<?> insertUser(@RequestBody User user) {
		int result = userService.insertUser(user);
		
		//result 가 0이면 등록 x
		//result 가 1이면 등록 o
		return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<?> login(User user, HttpSession session) {
		User tmp = userService.login(user);
		//로그인 실패
		if(tmp == null)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		
		session.setAttribute("loginUser", tmp.getUser_Id());
		return new ResponseEntity<String>(tmp.getUser_Id(), HttpStatus.OK);
	}
	
	@GetMapping("/logout")
	public ResponseEntity<Void> logout(HttpSession session) {
		session.invalidate();
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
