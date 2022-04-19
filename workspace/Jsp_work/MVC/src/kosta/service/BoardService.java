package kosta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kosta.model.Board;
import kosta.model.BoardDao2;
import kosta.model.ListModel;
import kosta.model.Reply;
import kosta.model.Search;

public class BoardService {
	private static BoardService service = new BoardService();
	private static BoardDao2 dao;
	private static final int PAGE_SIZE = 2;
	
	public static BoardService getInstance() {
		dao = BoardDao2.getInstance();
		return service;
	}
	
	public int insertBoardService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
		Board board = new Board();
		board.setTitle(request.getParameter("title"));
		board.setWriter(request.getParameter("writer"));
		board.setContents(request.getParameter("contents"));
		
		return dao.insertBoard(board);
	}
	
	public ListModel listBoardService(HttpServletRequest request)throws Exception{
		
		//검색 관련 내용
		Search search = new Search();
		HttpSession session = request.getSession();
		
		//새로운 검색을 할 경우
		if(request.getParameterValues("area") != null) {
			session.removeAttribute("search");
			search.setArea(request.getParameterValues("area"));
			search.setSearchKey("%" + request.getParameter("searchKey") + "%");
			session.setAttribute("search", search);
			
		}
		//체크해제 후 검색버튼만 클릭
		else if(request.getParameterValues("area") != null
				&& request.getParameter("pageNum") == null) {
			session.removeAttribute("search");
		}
		
		//세션에서 검색 정보가 있는 경우
		if(session.getAttribute("search") != null) {
			search = (Search)session.getAttribute("search");
		}
		
		
		
		//페이지 처리시 필요한 사항
		//페이지당 글 개수, 총 갯수, 총페이지수, 현재페이지
		//startPage, endPage, startRow, endRow
		
		//총 글 갯수
		int totalCount = dao.countBoard(search);
		
		//총 페이지수
		int totalPageCount = totalCount/PAGE_SIZE;
		if(totalCount%PAGE_SIZE > 0) {
			totalPageCount++;
		}
		
		//현재 페이지
		String pageNum = request.getParameter("pageNum");
		if(pageNum == null) {
			pageNum = "1";
		}

		int requestPage = Integer.parseInt(pageNum);
		
		//startPage = 현재페이지 - (현재페이지 - 1) % 5
		int startPage = requestPage - (requestPage - 1) % 5;
		
		//endPage 
		int endPage = startPage + 4;
		if(endPage > totalPageCount) {
			endPage = totalPageCount;
		}
		
		//startRow = (현재페이지 - 1) * 페이지당 글 갯수
		int startRow = (requestPage - 1) * PAGE_SIZE;
		
		
		List<Board> list = dao.listBoard(startRow, search);
		ListModel listModel = new ListModel(list, requestPage, totalPageCount, startPage, endPage);
		
		
		return listModel;
	}
	
	public Board detailBoard(int seq)throws Exception {
		
		return dao.detailBoard(seq);
	}
	
	public int updateBoardService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		Board board = new Board();
		board.setSeq(Integer.parseInt(request.getParameter("seq")));
		board.setTitle(request.getParameter("title"));
		board.setContents(request.getParameter("contents"));
		
		return dao.updateBoard(board);
		
	}
	
	public int insertReplyService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		Reply reply = new Reply();
		reply.setR_title(request.getParameter("r_title"));
		reply.setR_writer(request.getParameter("r_writer"));
		reply.setR_contents(request.getParameter("r_contents"));
		reply.setSeq(Integer.parseInt(request.getParameter("seq")));
		
		return dao.insertReply(reply);
	}
	
	public List<Reply> listReplyService(HttpServletRequest request)throws Exception{
		request.setCharacterEncoding("utf-8");
		
		List<Reply> list = dao.listReply();
		
		return list;
	}
}
