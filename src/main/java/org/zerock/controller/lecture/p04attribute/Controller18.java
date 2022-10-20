package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex18")
public class Controller18 {

	// /ex18/sub01?name=park&address=seoul&email=abc@daum.net
	@RequestMapping("sub01")
	public void method01(@ModelAttribute("bean") JavaBean01 b) {
		
	}
	
	// @ModelAttribute annotation 사용
	// bean2 라는 이름의 attribute를 model에 추가
	// bean2의 type : org.zerock.domain.lecture.JavaBean02
	@RequestMapping("sub02")
	public void method02(@ModelAttribute("bean2") JavaBean02 b) {
		b.setAge(30);
		b.setEmail("ab@daum.net");
		b.setName("park");
		b.setPassword("aaa");
	}
	
	@RequestMapping("sub03")
//	public void method03(@ModelAttribute("student") Student s) { 이름같으면 생략가능
	public void method03(@ModelAttribute Student s) {
		s.setClassName("soccer");
		s.setName("cha");
		s.setStudentNumber("13");
	}
	
	// 메소드 파라미터가 기본타입(8개, 또는 wrapper), String이면
	// @RequestParam이 붙은 것으로 간주
	// 기본타입 아니면 @ModelAttribute이므로 생략가능 ..
	@RequestMapping("sub04")
	public String method04(Student s) {
		s.setClassName("football");
		s.setName("son");
		s.setStudentNumber("7");
		
		return "ex18/sub03";
	}
}



























