package com.project1.services;

import java.util.List;

import com.project1.beans.Manager;
import com.project1.daos.ManagerDao;
import com.project1.daos.ManagerDaoImpl;

public class ManagerService {

	private ManagerDao  ms = new ManagerDaoImpl();
	
	public ManagerService() {
	}
	
	public List<Manager> getAllManager(){
		return ms.getAllManager();
	}
	
	public Manager getManager(int Manager_Id) {
		return ms.getManager(Manager_Id);
	}
	
	
}
