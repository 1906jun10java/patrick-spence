package com.project1.daos;

import java.io.IOException;
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

int status = 0; 

	public List<Employee> getAllEmployee() {
		List<Employee> emp = new ArrayList<>();
		
		try(Connection conn = ProjectConnection.getConnectionFromFile("database.properties")){
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
		 
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
		
			e1.printStackTrace();
		}
		return emp ;
	}

	public Employee getEmployee(int Employee_Id) { 
		Employee emp = new Employee();
		
		try(Connection conn = ProjectConnection.getConnectionFromFile("database.properties")){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM EMPLOYEE1 WHERE ID= ?");
			ps.setInt(1, Employee_Id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				emp.getEmployee_FN();
				emp.getEmployee_LN();
				emp.getEmployee_EM();
				emp.getEmployee_RR();
				emp.getEmployee_Id();
				emp.getManager_Id();
			}
			
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return emp; 
	}


	public int insertEmployee(Employee emp) {
		int status = 0;
		try(Connection conn = ProjectConnection.getConnectionFromFile("database.properties")){
			PreparedStatement ps = conn.prepareStatement("INSERT INTO EMPLOYEE1(EMPLOYEE_FN, EMPLOYEE_LN,"
					+ "EMPLOYEE_EM, EMPLOYEE_RR, EMPLOYEE_ID, MANAGER_ID) VALUES(?,?,?,?,?,?");
			ps.setString(1, emp.getEmployee_FN());
			ps.setString(2, emp.getEmployee_LN());
			ps.setString(3, emp.getEmployee_EM());
			ps.setString(4, emp.getEmployee_RR());
			ps.setInt(5, emp.getEmployee_Id());
			ps.setInt(6, emp.getManager_Id());
			status = ps.executeUpdate();
			
		}catch (SQLException | IOException e){
			e.printStackTrace();
		}
		
		return status;
		
	}
	public int updateEmployee(Employee emp) {
		int status = 0;
		try(Connection conn = ProjectConnection.getConnectionFromFile("database.properties")){
			PreparedStatement ps = conn.prepareStatement("UPDATE EMPLOYEE1 SET EMPLOYEE_FN=?, EMPLOYEE_LN=?,"
					+ "EMPLOYEE_EM=?, EMPLOYEE_RR=?, EMPLOYEE_ID=?, MANAGER_ID=? WHERE EMPLOYEE_ID=?"); 
			ps.setString(1, emp.getEmployee_FN());
			ps.setString(2, emp.getEmployee_LN());
			ps.setString(3, emp.getEmployee_EM());
			ps.setString(4, emp.getEmployee_RR());
			ps.setInt(5, emp.getEmployee_Id());
			ps.setInt(6, emp.getManager_Id());
			status = ps.executeUpdate();
		}catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return status; 
	}

/*
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
	*/
}
