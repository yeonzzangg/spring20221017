package org.zerock.domain.lecture;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.Data;

@Data
public class JavaBean27 {
	private String name;
	// 스트링타입으로 아니면 배열형태로 보여짐
	@JsonFormat(shape = JsonFormat.Shape.STRING) 
	private LocalDate date;
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private LocalDateTime dateTime;
}
