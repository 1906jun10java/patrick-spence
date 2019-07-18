package com.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project1.beans.Credentials;
import com.project1.beans.Employee;
import com.project1.services.AuthenticationService;

public class CompanyLogin extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AuthenticationService authService = new AuthenticationService();
	/* doGet method will handle all the request from this servlet */
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//retrieve the login webpage html file to load on the screen.
		req.getRequestDispatcher("CompanyLogin.html").forward(req, resp); 
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Credentials creds = new Credentials(req.getParameter("email"), req.getParameter("password")); 
		Employee e = authService.authenticateEmp(creds);
		if(e != null) {
			//writing directly to the response body
			resp.getWriter().write("Welcome, "+e.getEmployee_FN()+" "+e.getEmployee_LN());
		
		//resp.sendRedirect("CompanyLogin");
	}else {
		//OPTION 3: sends back a style code 403
		resp.sendError(403,"Invalid Credentials!");
	}
}
}
