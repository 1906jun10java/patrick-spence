package com.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project1.daos.EmployeeDao;
import com.project1.daos.EmployeeDaoImpl;
import com.project1.services.EmployeeService;

public class EmployeeInfo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EmployeeDao emp = new EmployeeDaoImpl();
	private EmployeeService employeeService;
	private ObjectMapper ojm;
	
	
	public EmployeeInfo() {
		ojm = new ObjectMapper(); 
		employeeService = new EmployeeService();
		
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//retrieve the login webpage html file to load on the screen.
		req.getRequestDispatcher("ViewEmployee.html").forward(req, resp); 
	}
	
//retrieving the employee information: 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		 HttpSession session = req.getSession();
		//retrieve employee info by ID:
		 int Employee_ID = Integer.parseInt(session.getAttribute("Employee_ID").toString());
		 resp.getWriter().write(ojm.writeValueAsString(employeeService.getEmployee(Employee_ID)));
	}
}
