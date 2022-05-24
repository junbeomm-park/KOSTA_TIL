package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyMapper {
	
	// 댓글 삽입
	public int insert(ReplyVO vo);
	
	// 특정 댓글 읽기
	public ReplyVO read(Long rno);
	
	// 댓글 수정
	public int update(ReplyVO vo);
	
	// 댓글 삭제
	public int delete (Long rno);
	
	// 댓글 리스트 페이징 처리
	public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cri, @Param("bno") Long bno);
	
	// 댓글 숫자 파악
	public int getCountByBno(Long bno);

}
