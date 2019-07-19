package com.project1.beans;

public class Request {

	public Request() {
		
	}
	
	
	public Request(int reimbursement_Id, int employee_Id, String employee_FN, String employee_EM, int request_Id) {
		super();
		Reimbursement_Id = reimbursement_Id;
		Employee_Id = employee_Id;
		Employee_FN = employee_FN;
		Employee_EM = employee_EM;
		Request_Id = request_Id;
	}


	private int Reimbursement_Id;
	private int Employee_Id;
	private String Employee_FN;
	private String Employee_EM;
	private int Request_Id;
	
	
	
	public int getReimbursement_Id() {
		return Reimbursement_Id;
	}
	public void setReimbursement_Id(int reimbursement_Id) {
		Reimbursement_Id = reimbursement_Id;
	}
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}
	public String getEmployee_FN() {
		return Employee_FN;
	}
	public void setEmployee_FN(String employee_FN) {
		Employee_FN = employee_FN;
	}
	public String getEmployee_EM() {
		return Employee_EM;
	}
	public void setEmployee_EM(String employee_EM) {
		Employee_EM = employee_EM;
	}
	public int getRequest_Id() {
		return Request_Id;
	}
	public void setRequest_Id(int request_Id) {
		Request_Id = request_Id;
	}


	@Override
	public String toString() {
		return "Request [Reimbursement_Id=" + Reimbursement_Id + ", Employee_Id=" + Employee_Id + ", Employee_FN="
				+ Employee_FN + ", Employee_EM=" + Employee_EM + ", Request_Id=" + Request_Id + "]";
	}
	
	
	
}

