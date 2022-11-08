package org.zerock.domain.myboard;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MyBoardDto {
	private int id;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime inserted;
}
