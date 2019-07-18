package com.project1.beans;

public class Credentials {

	/*
	 * holds the login credientials for the login page
	 */
	public Credentials(){
		
	}
	

	public Credentials(String Employee_EM, String password) {
		super();
		this.Employee_EM = Employee_EM;
		this.password = password;
	}


	private String Employee_EM;
	private String password;
	
	public String getEmployee_EM() {
		return Employee_EM;
	}
	public void setEmail(String Employee_EM) {
		this.Employee_EM = Employee_EM;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Employee_EM == null) ? 0 : Employee_EM.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credentials other = (Credentials) obj;
		if (Employee_EM == null) {
			if (other.Employee_EM != null)
				return false;
		} else if (!Employee_EM.equals(other.Employee_EM))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Credentials [Employee_EM=" + Employee_EM + ", password=" + password + "]";
	}
	
	
}

