package org.zerock.service.myboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.myboard.MyBoardDto;
import org.zerock.mapper.myboard.MyBoardMapper;

@Service
public class MyBoardService {
	
	@Autowired
	private MyBoardMapper mapper;
	
	public void register(MyBoardDto board) {
		mapper.insert(board);
	}
}
