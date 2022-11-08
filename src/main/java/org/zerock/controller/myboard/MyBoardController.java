package org.zerock.controller.myboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.myboard.MyBoardDto;
import org.zerock.service.myboard.MyBoardService;

@Controller
@RequestMapping("myboard")
public class MyBoardController {

	@Autowired
	private MyBoardService service;
	
	@GetMapping("register")
	public void register() {
		// /WEB-INF/views/myboard/register.jsp
	}

	@PostMapping("register")
	public void register(MyBoardDto board) {
		System.out.println(board);
		
		service.register(board);
	}

}