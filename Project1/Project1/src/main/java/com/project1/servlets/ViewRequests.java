package com.project1.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project1.beans.Request;
import com.project1.daos.RequestDao;
import com.project1.daos.RequestDaoImpl;
import com.project1.services.RequestService;

public class ViewRequests  extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RequestDao rq = new RequestDaoImpl();
	private RequestService requestService;
	private ObjectMapper ojm;
	
	public ViewRequests() {
		requestService = new RequestService();
		ojm = new ObjectMapper();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//retrieve the html file to load on the screen.
		req.getRequestDispatcher("Requests.html").forward(req, resp); 
		resp.setContentType("text/html");
		List<Request> r = new ArrayList<>();
		
	}

	
}