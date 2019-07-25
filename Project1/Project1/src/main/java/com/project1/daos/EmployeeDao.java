package com.project1.daos;

import java.util.List;

import com.project1.beans.Employee;
import com.project1.beans.Request;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int Employee_Id);
	//public Request addRequest();
	public int insertEmployee(Employee emp); 
	public int updateEmployee(Employee emp);
	

	
	

}
