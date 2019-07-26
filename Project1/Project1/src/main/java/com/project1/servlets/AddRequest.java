package com.project1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project1.beans.Request;
import com.project1.daos.RequestDao;
import com.project1.daos.RequestDaoImpl;
import com.project1.services.RequestService;

public class AddRequest extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RequestDao rq = new RequestDaoImpl();
	private RequestService requestService;
	private ObjectMapper ojm;

	//creating objects:
	public AddRequest() {
		requestService = new RequestService();
		ojm = new ObjectMapper();

	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.getRequestDispatcher("SubmitRequest.html").forward(req, resp); 
	}
		
		//adding a reimbursement request:
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		
		 int rmId = Integer.parseInt("Reimbursements_Id");
		 int empId = Integer.parseInt("Employee_Id");
		 String firstname = req.getParameter("Employee_FN");
		 String email = req.getParameter("Employee_EM");
		 int reqId = Integer.parseInt("Request_Id");
		 
		 Request request = new Request();
		 request.setReimbursement_Id(rmId);
		 request.setReimbursement_Id(empId);
		 request.setEmployee_FN(firstname);
		 request.setEmployee_EM(email);
		 request.setRequest_Id(reqId);
		 
		 boolean status = requestService.addRequest(request);
		 if(status == true) {
			 out.print("<p>Request Added Successfully</p>");
			 req.getRequestDispatcher("SubmitRequest.html").include(req, resp);
		 }else {
			 out.print("<p>Did not add Request </p>");
		 }
		 
		
	}
}

