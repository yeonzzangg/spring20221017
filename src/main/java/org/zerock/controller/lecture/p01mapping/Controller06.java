package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Controller06 {
	
	// get방식으로 /ex06/sub01로 요청 했을 때
	// 좀 더 구체적으로 requestmapping을 작성한 메소드가 우선권 갖음 = 메소드1이 일함
	
	// @RequestMapping(value = "sub01", method = RequestMethod.GET)
	@GetMapping("sub01")
	public void methid1() {
		System.out.println("메소드 1");
	}

	@RequestMapping("sub01")
	public void methid2() {
		System.out.println("메소드 2");
	}
	
	// get방식 : 메소드1 / post방식 : 메소드3 / 나머지 : 메소드2
	@PostMapping("sub01")
	public void methid3() {
		System.out.println("메소드 3");
	}
}
