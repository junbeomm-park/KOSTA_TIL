package kosta.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kosta.model.Reply;
import kosta.service.BoardService;

public class ListReplyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BoardService service = BoardService.getInstance();
		ActionForward forward = new ActionForward();
		
		List<Reply> relist = service.listReplyService(request);
		request.setAttribute("relist", relist);
		
		forward.setPath("/detail.jsp");
		forward.setRedirect(false);
		
		return forward;
	}

}
