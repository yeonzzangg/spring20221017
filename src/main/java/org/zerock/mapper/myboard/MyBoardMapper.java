package org.zerock.mapper.myboard;

import java.util.List;

import org.zerock.domain.myboard.MyBoardDto;

public interface MyBoardMapper {
	// 글작성
	void insert(MyBoardDto board);

	// 글목록
	List<MyBoardDto> list();

}
