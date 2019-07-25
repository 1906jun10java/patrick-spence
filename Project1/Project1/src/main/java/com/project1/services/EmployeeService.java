package com.project1.services;

import java.util.List;

import com.project1.beans.Employee;
import com.project1.daos.EmployeeDao;
import com.project1.daos.EmployeeDaoImpl;

public class EmployeeService {
	
	private EmployeeDao es = new EmployeeDaoImpl();

	public EmployeeService() {
	}
	

	public List<Employee> getAllEmployees(){
		return es.getAllEmployee();
	}

	public Employee getEmployee(int Employee_ID) {
		return es.getEmployee(Employee_ID);
	}
	public int insertEmployee(Employee emp) {
		return es.insertEmployee(emp); 
	}

	public int updateEmployee(Employee emp) {
		return es.updateEmployee(emp); 
	}
}