package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex04")
public class Controller04 {
	@RequestMapping("sub01")
	public void metnod01() {
		System.out.println("ex04 sub01 일함");
	}
	
	@RequestMapping(value = "sub02", method = RequestMethod.GET)
	public void metnod02() {
		System.out.println("ex04 sub02 일함");
	}
	
	@RequestMapping(value = "sub02", method = RequestMethod.POST)
	public void metnod03() {
		System.out.println("ex04 sub02 일함");
	}

	@RequestMapping(
			value = "sub03",
			method = {RequestMethod.POST, RequestMethod.GET})
	public void metnod04() {
		System.out.println("ex04 sub03 일함");
	}

	@RequestMapping(
			value = "sub04",
			method = {RequestMethod.POST, RequestMethod.GET})
	public void metnod05() {
		System.out.println("ex04 sub04 일함");
	}
}
