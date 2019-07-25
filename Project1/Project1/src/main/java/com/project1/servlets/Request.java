package com.project1.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	//trying to view all reimbursement request:
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		try {
			String rID = req.getParameter("Reimnbursements_Id");
			List<Request> rqs = new ArrayList<>();
			rqs.add((Request) rq.getAllRequest());
			if(rqs.equals(null)) {

				String requestJSON = ojm.writeValueAsString(rqs);
				if(!requestJSON.equals(null)) {
					resp.getWriter().write(requestJSON); 
				} else {
					resp.sendError(400);
				}

			}

		}catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}

