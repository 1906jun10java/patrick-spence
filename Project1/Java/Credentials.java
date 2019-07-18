public class Credentials {
	/*
	 * holds the login credientials for the login page
	 */
	public Credentials(){
		
	}
	

	public Credentials(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	private String email;
	private String password;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Credentials [email=" + email + ", password=" + password + "]";
	}
	
	
}
