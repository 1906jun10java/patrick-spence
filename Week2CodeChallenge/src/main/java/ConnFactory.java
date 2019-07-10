

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory
{ // singleton ConnFactory
	private static ConnFactory cf = new ConnFactory();

	// our constructor
	private ConnFactory()
	{
		super();

	}

	// creates a synchronized instance of the ConnFactory if none exsits and returns
	// an instance of itself
	public static synchronized ConnFactory getInstance()
	{
		if (cf == null)
		{
			cf = new ConnFactory(); // creates a new instance of our ConnFactory
		}
		return cf;
	}

	// attempts a connection with our SQL DB
	public Connection getConnection()
	{
		Connection conn = null; // sets up our connection
		Properties prop = new Properties(); // creates a new properties field
		// our try catch blocks to throw an exception just in case connection fails

		try
		{
			prop.load(new FileReader("database.properties"));
			Class.forName(prop.getProperty("oracle.jdbc.driver.OracleDriver"));
			conn = DriverManager.getConnection(prop.getProperty("jdbc:oracle:thin:@ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com:1521:ORCL"), prop.getProperty("PS_Java_19"),
					prop.getProperty("Revature"));

		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;

	}

}
