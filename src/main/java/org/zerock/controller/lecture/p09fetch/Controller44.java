package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean20;

@Controller
@RequestMapping("ex44")
public class Controller44 {
	
	@RequestMapping("sub")
	public void method() {
		
	}
	@RequestMapping("sub01")
	public void method1(String name, String address) {
		System.out.println("1번 메소드 일함");
		System.out.println(name);
		System.out.println(address);
	}
	
	@PostMapping("sub02")
	public void method02(@RequestBody String data) {
		//@RequestBody로 string으로는 사용가능
		// 객체로 사용하려면 Content-Type : application/json으로
		System.out.println("2번 메소드 일함");
		System.out.println(data);
	}
	
	@PostMapping("sub03")
	public void method03(@RequestBody JavaBean20 data) {
		System.out.println("3번 메소드 일함");
		System.out.println(data);
	}
}
