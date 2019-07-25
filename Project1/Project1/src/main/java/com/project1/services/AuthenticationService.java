package com.project1.services;

import com.project1.beans.Credentials;
import com.project1.beans.Employee;

public class AuthenticationService {

	public AuthenticationService(){
		
	}
	
	public Employee authenticateEmp(Credentials creds){
		Employee e = null;
		if(creds.getEmployee_EM().equals("@gmail")&& creds.getPassword().equals("P4ssword")){
			e = new Employee("Patrick", "Spence", creds.getEmployee_EM(), null, 0, 0); 
		}
		return e;		
	}	
	 
}

