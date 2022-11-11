package org.zerock.mapper.member;

import java.util.List;

import org.zerock.domain.member.MemberDto;

public interface MemberMapper {

	List<String> seletAll();

	int insert(MemberDto member);

	
	
}
