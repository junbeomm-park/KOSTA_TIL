package kosta.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import kosta.model.Board;
import kosta.model.Reply;
import kosta.model.Search;

public interface BoardMapper {
	List<Board> listBoard(Search search, RowBounds row);
	int insertBoard(Board board);
	Board detailBoard(int seq);
	int updateBoard(Board board);
	int deleteBoard(int seq);
	int countBoard(Search search);
	
	int insertReply(Reply reply);
	List<Reply> listReply(int seq);
}
