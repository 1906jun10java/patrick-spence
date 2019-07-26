package com.project1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project1.beans.Employee;
import com.project1.daos.EmployeeDaoImpl;
import com.project1.services.EmployeeService;

public class SaveEmployee extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EmployeeDaoImpl emp = new EmployeeDaoImpl();
	private EmployeeService employeeService;
	private ObjectMapper ojm;
	

	//creating objects:
	public SaveEmployee() {
		employeeService = new EmployeeService();
		ojm = new ObjectMapper();
		

	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.getRequestDispatcher("AddEmployee.html").forward(req, resp); 
	}
//adding new employee: 
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		  resp.setContentType("text/html");
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter(); 
		
		String firstname = req.getParameter("Employee_FN");
		String lastname = req.getParameter("Employee_LN");
		String email = req.getParameter("Employee_EM");
		String request = req.getParameter("Employee_RR"); 
		int empId = Integer.parseInt("Employee_Id");
		int manId = Integer.parseInt("Manager_Id");
		
		Employee emp = new Employee();
		emp.setEmployee_FN(firstname);
		emp.setEmployee_LN(lastname);
		emp.setEmployee_EM(email);
		emp.setEmployee_RR(request);
		emp.setEmployee_Id(empId);
		emp.setManager_Id(manId);
		
		int status = employeeService.insertEmployee(emp);
		if (status > 0) {
			out.print("<p>Successfully, added a new employee");
			req.getRequestDispatcher("AddEmployee.html").include(req, resp	);
		}
		
			resp.getWriter().write("Unable to add new employee"); 
		}
	
	}

