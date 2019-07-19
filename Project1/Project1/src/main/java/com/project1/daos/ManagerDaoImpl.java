package com.project1.daos;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project1.beans.Manager;
import com.project1.util.ProjectConnection;

public class ManagerDaoImpl implements ManagerDao {

	
	public List<Manager> getAllManager() {
		List<Manager> man = new ArrayList<>();
		
		try(Connection conn = ProjectConnection.getConnection()){
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = ((java.sql.Statement) stmt).executeQuery("SELECT * FROM MANAGER");
			
			while (rs.next()) {
				String Manager_FN = rs.getString("Manager_FN");
				String Manager_LN = rs.getString("Manager_LN");
				String Manager_EM = rs.getString("Manager_EM");
				String Manager_RR = rs.getString("Manager_RR");
				int Manager_Id = rs.getInt("Manager_Id");
				man.add(new Manager(Manager_FN, Manager_LN, Manager_EM, Manager_RR, Manager_Id));
				
			}
		
			return man; 
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	
	public Manager getManager(int Manager_Id) {
		try(Connection conn = ProjectConnection.getConnection()){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM MANAGER WHERE ID= ?");
			ps.setInt(1, Manager_Id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Manager man = new Manager();
				man.getManager_FN();
				man.getManager_LN();
				man.getManager_EM();
				man.getManager_RR();
				man.getManager_Id(); 
				
				return man;
			}
					
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
