package com.project1.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project1.beans.Employee;
import com.project1.beans.Request;
import com.project1.util.ProjectConnection;

public class EmployeeDaoImpl implements EmployeeDao {



	public List<Employee> getAllEmployee() {
		List<Employee> emp = new ArrayList<>();
		
		try(Connection conn = ProjectConnection.getConnection()){
			String sql = "SELECT * FROM EMPLOYEE1";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			String Employee_FN = rs.getString("Employee_FN");
			String Employee_LN = rs.getString("Employee_LN"); 
			String Employee_EM = rs.getString("Employee_EM");
			String Employee_RR = rs.getString("Employee_RR");
			int Employee_Id = rs.getInt("Employee_Id");
			int Manager_Id = rs.getInt("Manager_Id"); 
			emp.add(new Employee(Employee_FN, Employee_LN, Employee_EM, Employee_RR, Employee_Id, Manager_Id));
		}
		return emp; 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getEmployee(int Employee_Id) {
		try(Connection conn = ProjectConnection.getConnection()){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM EMPLOYEE1 WHERE ID= ?");
			ps.setInt(1, Employee_Id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Employee emp = new Employee();
				emp.getEmployee_FN();
				emp.getEmployee_LN();
				emp.getEmployee_EM();
				emp.getEmployee_RR();
				emp.getEmployee_Id();
				emp.getManager_Id();
				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	public Request addRequest() {
		try(Connection conn = ProjectConnection.getConnection()){
			PreparedStatement ps = conn.prepareStatement("INSERT INTO REQUEST VALUES (?, ?, ?, ?, ?");
			ps.setInt(1, Reimbursements_Id);
			ps.setInt(2, Employee_Id);
			ps.setString(3, Employee_FN);
			ps.setString(4, Employee_EM);
			ps.setInt(5, Request_Id);
			ResultSet rs = ps.executeQuery();
			
			if(rs ) {
			
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
}
