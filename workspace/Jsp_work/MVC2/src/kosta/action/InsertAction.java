package kosta.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.service.BoardService;

public class InsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		service.insertBoardService(request);
		
		forward.setPath("listAction.do");
		forward.setRedirect(true);
		System.out.println("asdasd");
		return forward;
	}

}
