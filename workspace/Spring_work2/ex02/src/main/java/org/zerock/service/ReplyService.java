package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;

public interface ReplyService {
	
	// 댓글 삽입
	public int register(ReplyVO vo);
	
	// 특정 댓글 읽기
	public ReplyVO get(Long rno);
	
	// 댓글 수정
	public int modify(ReplyVO vo);
	
	// 댓글 삭제
	public int remove(Long rno);
	
	// 댓글 리스트 페이징 처리
	public List<ReplyVO> getList(Criteria cri, Long bno);
	
	public ReplyPageDTO getListPage(Criteria cri, Long bno);
}
