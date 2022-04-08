package kosta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalServlet")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//num1, num2 값을 받아서 합을 구하기
		int num1, num2 = 0;
		String name = "";
		
		request.setCharacterEncoding("utf-8");
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		name = request.getParameter("userName");
		
		int result = num1 + num2;
		
		request.setAttribute("result", result);
		request.setAttribute("userName", name);
		
		RequestDispatcher re = request.getRequestDispatcher("/basic/result.jsp");
		re.forward(request, response);
	}

}
