package kosta.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kosta.mapper.BoardMapper;

@Repository
public class BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlTemplate;
	
	public void insert(Board board) {
		sqlTemplate.getMapper(BoardMapper.class).insertBoard(board);
	}
	
	public List<Board> list() {
		return sqlTemplate.getMapper(BoardMapper.class).listBoard();
	}
	
	public Board detail(int seq) {
		return sqlTemplate.getMapper(BoardMapper.class).detailBoard(seq);
	}
	
	public void update(Board board) {
		sqlTemplate.getMapper(BoardMapper.class).updateBoard(board);
	}
	
	public void delete(int seq) {
		sqlTemplate.getMapper(BoardMapper.class).deleteBoard(seq);
	}
}
