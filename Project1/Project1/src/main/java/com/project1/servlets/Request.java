package com.project1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project1.daos.RequestDao;
import com.project1.daos.RequestDaoImpl;
import com.project1.services.RequestService;

public class Request extends HttpServlet {


	private static final long serialVersionUID = 1L;
	RequestDao rq = new RequestDaoImpl();
	private RequestService requestService;
	private ObjectMapper ojm;

	//creating objects:
	public Request() {
		requestService = new RequestService();
		ojm = new ObjectMapper();

	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.getRequestDispatcher("SubmitRequest.html").forward(req, resp);
	}
	//viewing a reimbursement request:
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		int Emp_id = 0;
		
		if(Emp_id > 0) {
			rq.viewRequest(session.getAttribute("Employee_Id")); 
		
		}else {
			requestService.getAllRequest();
			out.write("unable to view request selected");
		}
		
		
	}
}

