package servlet;

import java.io.IOException;

import jakarta.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public controller() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("koushik")&& password.equals("1239")) {
			
			request.getSession().invalidate();
			HttpSession newsession = request.getSession();
			newsession.setMaxInactiveInterval(500);
			Cookie cookie=new Cookie("username", username);
			response.addCookie(cookie);
			response.sendRedirect("sucess.jsp");
		}
		else {
			response.sendRedirect("index.jsp");
		}
	}

}
