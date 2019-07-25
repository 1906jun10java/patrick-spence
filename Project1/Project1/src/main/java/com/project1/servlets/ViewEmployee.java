package com.project1.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project1.beans.Employee;
import com.project1.daos.EmployeeDao;
import com.project1.daos.EmployeeDaoImpl;
import com.project1.services.EmployeeService;

public class ViewEmployee extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	EmployeeDao em = new EmployeeDaoImpl();
	private EmployeeService employeeService;
	private ObjectMapper ojm;

	
	public ViewEmployee() {
		employeeService = new EmployeeService();
		ojm = new ObjectMapper();

	}
	//retreving  the employess within the list based on id number:
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String idCheck = req.getParameter("Employee_Id");
		if(idCheck != null) {
			int Employee_Id = Integer.parseInt(idCheck);
			String employeeJSON = ojm.writeValueAsString(employeeService.getEmployee(Employee_Id));
			if(!employeeJSON.equals("null")) {
				resp.getWriter().write(employeeJSON);
			}else {
				resp.getWriter().write(ojm.writeValueAsString(employeeService.getAllEmployees())); 
			}
		}
		
		
	}
}
