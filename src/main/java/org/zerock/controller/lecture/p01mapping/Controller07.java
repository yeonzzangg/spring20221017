package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Controller07 {

	@GetMapping("sub01")
	public void method01() {
		System.out.println("메소드1");
	}
	
	// 특정 값이 있을때^만^ 일하도록
	@GetMapping(value = "sub01", params = "name")
	public void method02() {
		System.out.println("메소드2");
	}

	@GetMapping("sub02")
	public void method03() {
		System.out.println("메소드3");
	}

	@GetMapping(value = "sub02", params = "address")
	public void method04() {
		System.out.println("메소드4");
	}

	@GetMapping(path = "sub03", params = "address=seoul")
	public void method05() {
		System.out.println("메소드5");
	}

	@GetMapping(path = "sub03")
	public void method06() {
		System.out.println("메소드6");
	}

	@GetMapping("sub04")
	public void method07() {
		System.out.println("메소드7");
	}

	// name, address 둘다 있어야만 실행됨
	@GetMapping(path = "sub04", params = {"name", "address"})
	public void method08() {
		System.out.println("메소드8");
	}
}
