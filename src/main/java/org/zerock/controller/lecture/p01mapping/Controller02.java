package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//@RequestMapping("ex02") 슬래시 생략 가능
@RequestMapping("/ex02")
@Controller
public class Controller02 {
	
	// 요청경로 "/ex02/sub01"
	@RequestMapping("/sub01")
	public void method01() {
		System.out.println("1일함");
	}
	
//	@RequestMapping("sub02") 슬래시 생략가능
	@RequestMapping("/sub02")
	public void method02() {
		System.out.println("2일함");
	}
	
	@RequestMapping("/sub03")
	public void method03() {
		System.out.println("3일함");
	}
}
