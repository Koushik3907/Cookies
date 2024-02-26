package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class sucesscontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public sucesscontroller() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "destroy":{
			request.getSession().invalidate();
			response.sendRedirect("index.jsp");
		}
		}
	}



}
