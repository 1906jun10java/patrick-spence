package com.project1.daos;

import java.util.List;

import com.project1.beans.Request;

public interface RequestDao {

	boolean updateRequest(Request request);
	boolean deleteRequest(int Request_Id);
	boolean addRequest(Request request);
	boolean viewRequest(Request request);
	public List<Request> getAllRequest();
	
}
