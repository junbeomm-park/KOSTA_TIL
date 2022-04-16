package kosta.mapper;

import java.util.List;
import java.util.Map;

import kosta.bean.Board;
import kosta.bean.Search;

public interface BoardMapper {
	List<Board> listBoard(Map map);
	int insertBoard(Board board);
	Board detailBoard(int seq);
	int updateBoard(Board board);
	int deleteBoard(int seq);
}
