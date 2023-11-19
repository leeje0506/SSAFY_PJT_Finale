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
    private ReviewService reviewService;

    @GetMapping("/restaurant/review/{id}/") 
	public ResponseEntity<?> list(@PathVariable int id) {
		List<Review> list = reviewService.selectAll(id);
		
		if (list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Review>>(list, HttpStatus.OK);
	}

	//등록
	@PostMapping("/restaurant/{id}/review")  // <- 여기를  {id} 부분을 빼는게 나으려나 일단 delete 하려면 레스토랑 아이디도 필요해서
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

//저기 등록부분이 빼고 그냥 requestbody로 처리할까?? 이게 헷갈리는게 원래 그냥 전체 리스트 가져오는건 뭐 없이 / 이거로만 하는 경우도 있엇잖아 근데
//그 레스토랑의 리뷰이면 일단 /restaurant 들어가야되는데 /restaurant 이렇게만 처리하면 레스토랑 경로랑 충돌날것같아서
//그냥 레스토랑은 레스토랑 컨트롤러에서 쓰고 있어 전체 레스토랑 목록 받아오는게  /restaurant 
// 컨트롤러 하나에다가 그냥??? 되긴 하는데 어 되나??    
// 내가 누르면 따라오나?? 방금 움직였어?? 맞아 ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
// 어쩐지 어제도 내가 움직이면 너 저 커서 모양 따라 와지더라 뭐지

//아 그치그치 그냥 레스토랑이 지금 뭐야? 상세? 이런 거 하려고 음
//리뷰를 레스토랑/{id}에다가 같이 띄우면 안되나 응응 리뷰를 따로 만들어도 그 상세 페이지 경로에만.. 리뷰 띄우게 못 하나 
//근데 이거 아까부터 왜 자꾸 페이지가 왔다갔다 하지 아하 그런가보다 방금 레스트 어쩌고 페이지 ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
//원래 따라가졌나 아닌데 왜 오늘은 따라가냐 ㅇ아