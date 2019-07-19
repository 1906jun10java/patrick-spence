package com.project1.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ProjectConnection {

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com";
		String username = "PS_Java_19";
		String pass = "Revature";
		return DriverManager.getConnection(url, username, pass);
	}
	
	public  Connection getConnectionFromFile(String filename) throws SQLException, IOException {
		Properties prop = new Properties();
		InputStream stream = this.getClass().getResourceAsStream("/database.properties");
		prop.load(stream);
		return DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("pass"));
	}

}

