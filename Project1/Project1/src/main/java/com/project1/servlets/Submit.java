package com.project1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project1.beans.Request;
import com.project1.daos.RequestDaoImpl;

public class Submit extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.setContentType("text/html");  
        PrintWriter out=resp.getWriter();  
        int Reimbursements_Id;
        int Employee_Id;
        int Request_Id;
		
		Reimbursements_Id= Integer.parseInt(req.getParameter("Reimbursements_Id"));
		Employee_Id= Integer.parseInt(req.getParameter("Employee_Id"));
		String Employee_FN= req.getParameter("Employee_FN");
		String Employee_EM= req.getParameter("Employee_EM");
		Request_Id= Integer.parseInt(req.getParameter("Request_Id"));
		
		Request rqs = new Request(); 
		rqs.setReimbursement_Id(Reimbursements_Id);
		rqs.setEmployee_Id(Employee_Id);
		rqs.setEmployee_FN(Employee_FN);
		rqs.setEmployee_EM(Employee_EM);
		rqs.setRequest_Id(Employee_Id); 
		
		int status = rqs.getReimbursement_Id();
		if(status > 0) {
			req.getRequestDispatcher("submitrequest").include(req, resp);
		}else {
			out.println("<p>Form not submitted</p>");
		}
		
		
		}
	}


