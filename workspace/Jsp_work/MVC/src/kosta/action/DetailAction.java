package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board;
import kosta.service.BoardService;

public class DetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		Board board = service.detailBoard(seq);
		
		request.setAttribute("board", board);
		
		forward.setPath("/detail.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
