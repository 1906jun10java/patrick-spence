package com.project1.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.project1.beans.Request;
import com.project1.util.ProjectConnection;

public class RequestDaoImpl implements RequestDao{

	public boolean updateRequest(Request request) {
		try(Connection conn = ProjectConnection.getConnection()){
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
		try(Connection conn = ProjectConnection.getConnection()){
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
		try(Connection conn = ProjectConnection.getConnection()){
			PreparedStatement ps = conn.prepareStatement("INSERT INTO REQUEST VALUES REIMBURSEMENTS_ID=?, EMPLOYEE_ID=?,EMPLOYEE_FN=?"
					+ "EMPLOYEE_EM, REQUEST_ID");
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
	
}
