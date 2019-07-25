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
		String url = "jdbc:oracle:thin:ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com:1521:orcl";
		String username = "PS_Java_19";
		String pass = "Revature";
		return DriverManager.getConnection(url, username, pass);
	}

	public static  Connection getConnectionFromFile(String filename) throws SQLException, IOException {
		Connection c = null;
			try {
		Properties prop = new Properties();
		InputStream stream = ProjectConnection.class.getClassLoader().getResourceAsStream(filename);
		prop.load(stream);

			Class.forName("oracle:jdbc.driver.OracleDriver");
			c = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("pass"));
		} catch (ClassNotFoundException ex) {
			System.out.println("unable to load driver class!");
		}
			return c; 
		}
	}


