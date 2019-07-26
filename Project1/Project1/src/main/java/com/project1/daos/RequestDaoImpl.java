package com.project1.daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project1.beans.Employee;
import com.project1.beans.Request;
import com.project1.util.ProjectConnection;

public class RequestDaoImpl implements RequestDao{
	
	public static Connection getConnection() {
	Connection conn = null;
	try {
		Class.forName("oracle:jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com:1521:orcl","PS_Java_19", "Revature");

	}catch (Exception e) {
		e.printStackTrace();
	}
	return conn; 
}


	public boolean updateRequest(Request request) {
		try(Connection conn = RequestDaoImpl.getConnection()){
			PreparedStatement ps = conn.prepareStatement("UPDATE EMPLOYEE_ID FROM REQUEST SET REIMBURSEMENTS_ID=?, EMPLOYEE_ID=?,EMPLOYEE_FN=?"
					+ "EMPLOYEE_EM=?, REQUEST_ID=?");
			ps.setInt(1, request.getReimbursement_Id());
			ps.setInt(2, request.getEmployee_Id());
			ps.setString(3, request.getEmployee_FN());
			ps.setString(4, request.getEmployee_EM());
			ps.setInt(5, request.getRequest_Id());
			int rs = ps.executeUpdate();

			if(rs==1) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return false;
	}

	public boolean deleteRequest(int Request_Id) {
		try(Connection conn = RequestDaoImpl.getConnection()){
			Statement stmt = conn.createStatement();
			int rs = stmt.executeUpdate("DELETE FROM REQUEST WHERE REQUEST_ID=" + Request_Id);

			if(rs==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean addRequest(Request request) {
		try(Connection conn = RequestDaoImpl.getConnection()){
			PreparedStatement ps = conn.prepareStatement("INSERT INTO REQUEST (REIMBURSEMENTS_ID, EMPLOYEE_ID, EMPLOYEE_FN"
					+ "EMPLOYEE_EM, REQUEST_ID VALUES(?,?,?,?,?)");
			ps.setInt(1, request.getReimbursement_Id());
			ps.setInt(2, request.getEmployee_Id());
			ps.setString(3, request.getEmployee_FN());
			ps.setString(4, request.getEmployee_EM());
			ps.setInt(5, request.getRequest_Id());
			int rs = ps.executeUpdate();

			if(rs==1) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return false;
	}

	public boolean viewRequest(Request request) {
		try(Connection conn = RequestDaoImpl.getConnection()){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM REQUEST WHERE EMPLOYEE_ID=?");
			ps.setInt(1, request.getEmployee_Id());
			ResultSet rs = ps.executeQuery(); 

			if ( rs.equals(request.getEmployee_Id())) {
				return true;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false; 
	}
	public List<Request> getAllRequest(){
		List<Request> rqs = new ArrayList<>();

		try(Connection conn = RequestDaoImpl.getConnection()){
			String sql = "SELECT * FROM REQUEST";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int Reimbursement_Id = rs.getInt("Reimbursements_Id");
				int Employee_Id = rs.getInt("Employee_Id");
				String Employee_FN = rs.getString("Employee_FN");
				String Employee_EM = rs.getString("Employee_EM");
				int Request_Id = rs.getInt("Request_Id");
				rqs.add(new Request(Reimbursement_Id, Employee_Id, Employee_FN, Employee_EM, Request_Id)); 

			}
		}catch (SQLException | NullPointerException e) {
			e.printStackTrace();
		}
		return rqs;
	}
}


