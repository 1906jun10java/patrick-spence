package com.project1.services;

import java.util.List;

import com.project1.beans.Request;
import com.project1.daos.RequestDao;
import com.project1.daos.RequestDaoImpl;

public class RequestService {

	private RequestDao rs = new RequestDaoImpl();
	
	public RequestService() {
}
	public boolean updateRequest(Request request) {
		return rs.updateRequest(request);
	}
	
	public boolean deleteRequest(int Request_Id) {
		return rs.deleteRequest(Request_Id);
	}
	
	public boolean addRequest(Request request) {
		return rs.addRequest(request);
	}
	
	public boolean viewRequest(Request request) {
		return rs.viewRequest(request);
	}
	public List<Request> getAllRequest(){
		return rs.getAllRequest();

	}
}
