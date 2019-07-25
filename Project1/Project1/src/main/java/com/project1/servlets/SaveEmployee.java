package com.project1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project1.beans.Employee;
import com.project1.daos.EmployeeDaoImpl;

public class SaveEmployee extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		int Employee_Id;
		int Manager_Id;
		
		String Employee_FN = req.getParameter("Employee_FN");
		String Employee_LN = req.getParameter("Employee_LN");
		String Employee_EM = req.getParameter("Employee_EM");
		String Employee_RR = req.getParameter("Employee_RR");
		Employee_Id= Integer.parseInt(req.getParameter("Employee_Id"));
		Manager_Id = Integer.parseInt(req.getParameter("Manager_Id")); 
		
		Employee emp = new Employee();
		emp.setEmployee_FN(Employee_FN);
		emp.setEmployee_LN(Employee_LN);
		emp.setEmployee_EM(Employee_EM);
		emp.setEmployee_RR(Employee_RR);
		emp.setEmployee_Id(Employee_Id);
		emp.setManager_Id(Manager_Id); 
		
		int status = emp.getEmployee_Id(); 
		if (status > 0) {
			req.getRequestDispatcher("EmployeeTable.html").include(req, resp);
		}else {
			//console.log alert action
		}
	}
}
