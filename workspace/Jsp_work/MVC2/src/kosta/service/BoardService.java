package kosta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import kosta.model.Board2;
import kosta.model.BoardDao;

public class BoardService {
	private static BoardService service = new BoardService();
	private static BoardDao dao;
	
	public static BoardService getInstance() {
		dao = BoardDao.getInstance();
		return service;
	}
	
	public int insertBoardService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		
		Board2 board = new Board2();
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContents(request.getParameter("contents"));
		
		return dao.insertBoard(board);
	}
	
	public List<Board2> listBoardService(HttpServletRequest request)throws Exception{
		List<Board2> list = dao.listBoard();
		
		return list;
	}
}
