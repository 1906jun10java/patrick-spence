package com.project1.daos;

import com.project1.beans.Request;

public interface RequestDao {

	boolean updateRequest(Request request);
	boolean deleteRequest(int Request_Id);
	boolean addRequest(Request request);
	
}
