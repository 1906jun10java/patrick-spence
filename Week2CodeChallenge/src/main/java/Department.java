import java.sql.*;

public class Department {
	/*
	 *calling the DRIVER AND URL from the class itself, depsite having the database properties file 
	 *the DRIVER AND URL are static final, meaning they called upon the class itself, and final
	 * stating that it can't be alter, in anyway. 
	 * This is the same for the USERNAME AND PASSWORD.
	 */
	static final String Driver = "oracle.jdbc.driver.OracleDriver";
	static final String Url= "jdbc:oracle:thin:@ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com:1521:ORCL";
	static final String Usr= "PS_Java_19";
	static final String Password= "Revature";

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(Url,Usr,Password); 
			//creating a prepared statement to insert a new EMPLOYEE2
			//??? in the parameters are place holders
			String sql = "INSERT INTO DEPARTMENT VALUES(DEPARTMENT_SEQUENCE.NEXTVAL,?,?,?)";
			ps= conn.prepareStatement(sql);
			//ENTERS IN THE DEPARTMENTS
			ps.setString(1, "Engineering");
			ps.setString(2, "HR");
			ps.setString(3, "Recieving");
			
			sql = "SELECT * FROM DEPARTMENT";
			ResultSet rs = ps.executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
