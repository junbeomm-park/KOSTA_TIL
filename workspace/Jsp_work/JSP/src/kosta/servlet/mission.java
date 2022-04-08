package kosta.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mission")
public class mission extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public mission() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		out.println("<html><head><title>Hello</title></head>");
		out.println("<body>");
		out.println("<h1> result : "+sum+"</h1>");
		out.println("</body>");
		out.println("</html");
		
		out.close();
		
		
	}


	

}
