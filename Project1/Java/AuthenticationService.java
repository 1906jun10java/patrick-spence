public class AuthenticationService {
	
	public AuthenticationService(){
		
	}
	
	public Employee authenticateEmp(Credentials creds){
		Employee e = null;
		if(creds.getEmployee_EM().equals("@gmail")&& creds.getPassword().equals("P4ssword")){
			e = new Employee("Patrick", "Spence", creds.getEmail); 
		}
		retunrs e; 
	}
}