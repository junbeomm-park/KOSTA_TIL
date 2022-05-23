package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.ReplyMapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyMapper mapper;
	

	// 댓글 삽입
	@Override
	public int register(ReplyVO vo) {
		
		log.info("register......" + vo);
		
		return mapper.insert(vo);
	}
	
	// 특정 댓글 읽기
	@Override
	public ReplyVO get(Long rno) {
		
		log.info("get....." + rno);
		
		return mapper.read(rno);
	}

	// 댓글 수정
	@Override
	public int modify(ReplyVO vo) {
		
		log.info("modify....." + vo);
	
		return mapper.update(vo);
	}
	
	//댓글 삭제
	@Override
	public int remove(Long rno) {
		
		log.info("remove....." + rno);
		
		return mapper.delete(rno);
	}

	// 댓글 리스트 페이징 처리
	@Override
	public List<ReplyVO> getList(Criteria cri, Long bno) {
		
		log.info("get Reply List of a Board " + bno);
		
		return mapper.getListWithPaging(cri, bno);
	}

}
