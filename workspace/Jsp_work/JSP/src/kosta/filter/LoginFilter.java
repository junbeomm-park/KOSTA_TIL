package kosta.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter({"/session/logout.jsp", "/session/main.jsp"})
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest rq = (HttpServletRequest)request;
		HttpServletResponse rp = (HttpServletResponse)response;
		
		/* 	String name = (String)session.getAttribute("name");
		if(name == null){
			response.sendRedirect("loginForm.jsp");
		} */
		
		HttpSession session = rq.getSession();
		String name = (String)session.getAttribute("name");
		if(name == null){
			rp.sendRedirect("loginForm.jsp");
		}
		
		chain.doFilter(request, response);
	}

}
