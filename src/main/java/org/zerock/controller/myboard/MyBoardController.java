package org.zerock.controller.myboard;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String register(MyBoardDto board) { // request param 수집/가공
		
		// business logic
		service.register(board);
		
		// /myboard/list로 redirect
		return "redirect:/myboard/list";
	}
	
	@GetMapping("list")
	public void list(Model model) {
		List<MyBoardDto> list = service.listBoard();
		
		// add attribute
		model.addAttribute("boardList", list);
		// forward
	}

}