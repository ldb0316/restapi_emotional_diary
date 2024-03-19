package com.emo.emotional_diary.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emo")
public class EmoMastController {

	@GetMapping(value = "")
	public String getDiaryList(@RequestParam("query") String query) {
		// 스프링 부트 3.2 or higher 
		// RequestParam에 파라미터명을 명시해주어야지 정상 작동함
		// 파라미터를 넘기지 않을 경우 400 Bad Request 발생
		
		return query;
	}
//	@GetMapping(value = "")
//	public String getDiaryList(HttpServletRequest req) {
//		String query = req.getParameter("test");
//		return query;
//	}
	
	@GetMapping(value = "/{id}")
	public String getDiaryOne(@PathVariable("id") String id) {
		return id;
	}
	
}
