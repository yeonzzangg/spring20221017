package org.zerock.service.myboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.myboard.MyBoardDto;
import org.zerock.mapper.myboard.MyBoardMapper;

@Service
public class MyBoardService {
	
	@Autowired
	private MyBoardMapper mapper;
	
	
	// 글작성
	public void register(MyBoardDto board) {
		mapper.insert(board);
	}
	
	
	// 목록
	public List<MyBoardDto> listBoard() {
		return mapper.list();
	}
}
