package org.zerock.mapper;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private Long[] bnoArr = { 1245190L, 1245189L, 1245188L, 1245187L, 1245186L };

	@Autowired
	private ReplyMapper mapper;
	
	@Test
	public void testMapper() {
		
		log.info(mapper);
		
	}
	
	@Test
	public void testCreate() {
		
		IntStream.rangeClosed(1, 10).forEach(i -> {
			
			ReplyVO vo = new ReplyVO();
			
			//게시물 번호
			vo.setBno(bnoArr[i % 5]);
			vo.setReply("댓글 테스트 " + i);
			vo.setReplyer("replyer" + i);
			
			mapper.insert(vo);
			
		});
	}
	
//	@Test
//	public void testRead() {
//		
//		Long targetRno = 5L;
//		
//		ReplyVO vo = mapper.read(targetRno);
//		
//		log.info(vo);
//	}
//	
//	@Test
//	public void testDelete() {
//		
//		Long targetRno = 15L;
//		
//		mapper.delete(targetRno);
//	}

//	@Test
//	public void testUpdate() {
//		
//		Long targetRno = 15L;
//		
//		ReplyVO vo = mapper.read(targetRno);
//		
//		vo.setReply("Update Reply");
//		
//		int count = mapper.update(vo);
//		
//		log.info("UPDATE COUNT : " + count);
//	}
	
//	@Test
//	public void testList() {
//		
//		Criteria cri = new Criteria();
//		
//		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
//		
//		replies.forEach(reply -> log.info(reply));
//	}
	
//	@Test
//	public void testList2() {
//		
//		Criteria cri = new Criteria(1,10);
//		
//		List<ReplyVO> replies = mapper.getListWithPaging(cri, 1245190L);
//		
//		replies.forEach(reply -> log.info(reply));
//	}
}