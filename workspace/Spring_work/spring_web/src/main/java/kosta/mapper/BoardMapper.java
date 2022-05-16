package kosta.mapper;

import java.util.List;
import kosta.model.Board;

public interface BoardMapper {
	List<Board> listBoard();
	int insertBoard(Board board);
	Board detailBoard(int seq);
	int updateBoard(Board board);
	int deleteBoard(int seq);

}
