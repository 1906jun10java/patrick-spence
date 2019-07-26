package com.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project1.beans.Employee;
import com.project1.beans.Credentials;
import com.project1.services.*;

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
		HttpSession session = req.getSession(true); //created a new session
		
		Credentials creds = new Credentials(req.getParameter("Employee_EM"), req.getParameter("password")); 
		Employee e = authService.authenticateEmp(creds);
		
			
		if(e != null) {
			
			resp.sendRedirect("welcomepage");
			
					
			session.setAttribute("Employee_FN", e.getEmployee_FN());
			session.setAttribute("Employee_LN", e.getEmployee_LN());
			session.setAttribute("Employee_EM", e.getEmployee_EM());
			session.setAttribute("Employee_RR", e.getEmployee_RR());
			session.setAttribute("Employee_Id", e.getEmployee_Id());
			session.setAttribute("Manager_Id", e.getEmployee_Id());
			
			
			
		}else {

			session.setAttribute("problem", "invalid credentials");
			
			//req.getRequestDispatcher("companylogin").include(req, resp);
			resp.sendRedirect("managerwelcome");
		} 
	}
}
 	 
