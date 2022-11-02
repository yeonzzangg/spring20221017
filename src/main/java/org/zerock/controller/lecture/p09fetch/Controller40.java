package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex40")
public class Controller40 {

	@RequestMapping("sub0")
	public void method0() {
		// jsp로 포워드
	}
	
	@GetMapping("sub01")
	public void method1() {
		System.out.println("/ex40/sub01 get 방식 요청 잘 받음");
	}
	
	@GetMapping("sub02")
	public void method2() {
		System.out.println("/ex40/sub02 get 방식 요청 잘 받았다!!!");
	}
	
	@PostMapping("sub03")
	public void method3() {
		System.out.println("/ex40/sub03 post 방식 요청 잘 받음@@");
	}
	
	@GetMapping("sub04")
	public void method4() { 
		System.out.println("/ex40/sub04 get 방식 요청 잘 받음###");
	}
	
	@PostMapping("sub04")
	public void method5() {
		System.out.println("/ex40/sub04 post 방식 요청 잘 받음**********");
	}

//	@RequestMapping(path = "sub04", method = RequestMethod.PUT)
	@PutMapping("sub04")
	public void method6() {
		System.out.println("/ex40/sub04 put 방식 요청 잘 받음~!~!~!~");
	}

//	@RequestMapping(path = "sub04", method = RequestMethod.DELETE)
	@DeleteMapping("sub04")
	public void method7() {
		System.out.println("/ex40/sub04 delete 방식 요청 잘 받음~!~!~!~");
	}
	
	@GetMapping("sub05")
	public void method8() {
		System.out.println("/ex40/sub04 get");
	}
	@PostMapping("sub05")
	public void method9() {
		System.out.println("/ex40/sub04 post");
	}
	@PutMapping("sub05")
	public void method10() {
		System.out.println("/ex40/sub04 put");
	}
	@DeleteMapping("sub05")
	public void method11() {
		System.out.println("/ex40/sub04 delete");
	}
	
}









