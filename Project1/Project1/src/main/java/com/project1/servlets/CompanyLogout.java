package com.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CompanyLogout extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public CompanyLogout() {
		super();
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// invalidate current session
		HttpSession session = req.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		// redirect back to login
		resp.sendRedirect("companylogin");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
