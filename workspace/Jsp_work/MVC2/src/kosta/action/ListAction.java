package kosta.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Board2;
import kosta.service.BoardService;

public class ListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		List<Board2> list = service.listBoardService(request);
		request.setAttribute("list", list);
		
		forward.setPath("/list.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
