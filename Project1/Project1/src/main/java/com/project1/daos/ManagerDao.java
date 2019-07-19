package com.project1.daos;

import java.util.List;

import com.project1.beans.Manager;

public interface ManagerDao {
	
	public List<Manager> getAllManager();
	public Manager getManager(int Manager_Id);

}
