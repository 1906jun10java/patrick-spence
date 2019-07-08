import java.sql.*;

public class Department {
	/*
	 *calling the DRIVER AND URL from the class itself, depsite having the database properties file 
	 *the DRIVER AND URL are static final, meaning they called upon the class itself, and final
	 * stating that it can't be alter, in anyway. 
	 * This is the same for the USERNAME AND PASSWORD.
	 */
	static final String Driver = "oracle.jdbc.driver.OracleDriver";
	static final String Url= "jdbc:oracle:thin:@ps-java-2019.clnr7kehhybf.us-east-1.rds.amazonaws.com";
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
			String sql = "SELECT EMPLOYEE2.SALARY, EMPLOYEE2.EMP_FIRSTNAME, DEPARTMENT.DEPARTMENT_ID, FROM EMPLOYEE2 LEFT JOIN DEPARTMENT ON EMPLOYEE2.DEPARTMENT_ID = DEPARTEMENT.DEPARTMENT_ID ORDER BY EMP_FIRSTNAME AND AVG(SALARY)=?";
			ps= conn.prepareStatement(sql);
			//populating the Salary to caluclate the AVG.
			ps.setFloat(1, 65000);
			ps.setFloat(2, 45000);
			ps.setFloat(3, 60000);
			ps.setFloat(4, 58000);
			ps.setFloat(5, 35000);
			ps.setFloat(6, 20000);
			
			sql = "SELECT AVG(SALARY) FROM EMPLOYEE2";
			ResultSet rs = ps.executeQuery(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
}
