package kosta.mapper;

import java.util.List;

import kosta.model.Board2;

public interface BoardMapper {
	List<Board2> listBoard();
	int insertBoard(Board2 board);
}
