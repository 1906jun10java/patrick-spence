import java.sql.*;
public class Employee {
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

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(Url,Usr,Password); 
			//creating a prepared statement to insert a new EMPLOYEE2
			//??? in the parameters are place holders
			String sql = "INSERT INTO EMPLOYEE2_ VALUES(EMPLOYEE2_SEQUENCE.NEXTVAL,?,?,?,?,?)";
			ps = conn.prepareStatement(sql); 
			//setting the parameters for the prepareStatement
			//([index], [the information input based on datatype])
	
			ps.setString(1, "Joseph");
			ps.setString(2,"Stalin" );
			ps.setInt(3, 3);
			ps.setInt(4, 29000);
			ps.setString(5,"Stallon_da_Stalin@gmail.com" );
			ps.executeUpdate();

			sql ="SELECT * FROM EMPLOYEE2_";
			ResultSet rs = ps.executeQuery(sql);

			while(rs.next()){
				//Retrieve by column name
				int EMPLOYEE_ID  = rs.getInt("EMPLOYEE_ID");
				String EMP_FIRSTNAME = rs.getString("EMP_FIRSTNAME");
				String EMP_LASTNAME = rs.getString("EMP_LASTNAME");
				int DEPARTMENT_ID = rs.getInt("DEPARTMENT_ID");
				int SALARY= rs.getInt("SALARY");
				String EMP_EMAIL =rs.getString("EMP_EMAIL"); 

				//sys-out the values to be printed 
				System.out.print("ID: " +EMPLOYEE_ID);
				System.out.print(", FIRST: " + EMP_FIRSTNAME);
				System.out.print(", LAST: " + EMP_LASTNAME);
				System.out.print(", DEP_ID: " + DEPARTMENT_ID);
				System.out.print(", SALARY: " + SALARY);
				System.out.println(", EMAIL: "+ EMP_EMAIL);
			}

		} catch (SQLException e) {
			e.printStackTrace(); 
		} catch (Exception e) {
			e.printStackTrace();
		}finally { 


		}
	}
}
