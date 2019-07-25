package com.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project1.beans.Employee;

public class SessionServlet extends HttpServlet {

	/**
	 * returning the authenticated users JSESSIONID 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		HttpSession session = req.getSession(false);
		//creates a new session if one hasn't already been created 
		if (session != null && session.getAttribute("Employee_Id") != null) {
			try {
				String Employee_FN = session.getAttribute("Employee_FN").toString();
				String Employee_LN = session.getAttribute("Employee_LN").toString();
				String Employee_EM = session.getAttribute("Employee_EM").toString();
				String Employee_RR = session.getAttribute("Employee_RR").toString();
				int Employee_Id = Integer.parseInt(session.getAttribute("Employee_Id").toString());
				int Manager_Id = Integer.parseInt(session.getAttribute("Manager_Id").toString());
				
				Employee emp = new Employee(Employee_FN, Employee_LN, Employee_EM, Employee_RR, Employee_Id, Manager_Id);
				
				resp.getWriter().write((new ObjectMapper()).writeValueAsString(emp));
				
			} catch (Exception e) {
				e.printStackTrace();
				resp.getWriter().write("{\"session\":null}");
			}
		}else {
			resp.getWriter().write("{\"session\":null}"); 
		}
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		doGet(req, resp); 
	}
	

}
