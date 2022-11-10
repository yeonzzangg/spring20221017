package org.zerock.service.myboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.myboard.MyBoardDto;
import org.zerock.mapper.myboard.MyBoardMapper;

// mapper에게 일시키는 역할
@Service
public class MyBoardService {
	
	@Autowired
	private MyBoardMapper mapper;
	
	public MyBoardDto get(int id) {
		return mapper.select(id);
	}
	
	// 목록
	public List<MyBoardDto> listBoard() {
		return mapper.list();
	}

	// 글작성
	public void register(MyBoardDto board) {
		mapper.insert(board);
	}

}
