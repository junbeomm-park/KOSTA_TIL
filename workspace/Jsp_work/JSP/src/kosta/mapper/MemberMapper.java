package kosta.mapper;

import java.util.List;

import kosta.bean.Member;

public interface MemberMapper {
	int insertMember(Member member);
	List<Member> listMember();
}
