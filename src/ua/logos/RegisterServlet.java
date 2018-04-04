package ua.logos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/register.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		System.out.println(firstName + " " + lastName);
		
	
		
//		req.setAttribute("firstName", firstName);
//		req.setAttribute("lastName", lastName);	
//		req.getRequestDispatcher("/register.jsp").forward(req, resp);
		
		
		resp.sendRedirect(req.getContextPath() + "/?firstName=" + firstName + "&lastName=" + lastName);
		
	}

	
	
}
