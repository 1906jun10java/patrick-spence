package com.project1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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

public class UpdateRequest extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RequestDao rq = new RequestDaoImpl();
	private RequestService requestService;
	private ObjectMapper ojm;

	//creating objects:
	public UpdateRequest() {
		requestService = new RequestService();
		ojm = new ObjectMapper();

	}
	//updating a reimbursement request status:
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();

		out.println("<h2> Updating Request</h2>");
		out.println("<ul id='viewrequest'></ul>");

		List<Request> rqs = requestService.getAllRequest();
		
		
		out.println("<table border='1' width='100%'");
		out.println("<tr><th>Reimbursements Id</th><th>Employee Id</th><th>Employee Name</th><th>Employee Email</th><th>Request Id</th></tr>");
		for(Request r: rqs) {
			out.println("<tr><td>"+r.getReimbursement_Id()+"</td><td>"+r.getEmployee_Id()+"</td><td>"+r.getEmployee_FN()+"</td><td>"+r.getEmployee_EM()+"</td><td>"+r.getRequest_Id()+"</td>");
		}
		out.println("</table>");
		out.println("<script>scripts/viewrequest.js</script>");
		out.close();

	}
}


