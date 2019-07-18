package com.project1.beans;

public class Employee {
		
		//Employee no-args Constructor: 
		public Employee() {
			
		}
		//Employee Constructor with fields: 
		public Employee(String employee_FN, String employee_LN, String employee_EM, String employee_RR, int employee_Id,
				int manager_Id) {
			super();
			Employee_FN = employee_FN;
			Employee_LN = employee_LN;
			Employee_EM = employee_EM;
			Employee_RR = employee_RR;
			Employee_Id = employee_Id;
			Manager_Id = manager_Id;
		}
		//Employee fields: 
		private String Employee_FN;
		private String Employee_LN;
		private String Employee_EM;
		private String Employee_RR;
		private int	Employee_Id;
		private int Manager_Id;
		
		//Getters and Setters for the Employee fields: 
		public String getEmployee_FN() {
			return Employee_FN;
		}



		public void setEmployee_FN(String employee_FN) {
			Employee_FN = employee_FN;
		}



		public String getEmployee_LN() {
			return Employee_LN;
		}



		public void setEmployee_LN(String employee_LN) {
			Employee_LN = employee_LN;
		}



		public String getEmployee_EM() {
			return Employee_EM;
		}



		public void setEmployee_EM(String employee_EM) {
			Employee_EM = employee_EM;
		}



		public String getEmployee_RR() {
			return Employee_RR;
		}



		public void setEmployee_RR(String employee_RR) {
			Employee_RR = employee_RR;
		}



		public int getEmployee_Id() {
			return Employee_Id;
		}



		public void setEmployee_Id(int employee_Id) {
			Employee_Id = employee_Id;
		}



		public int getManager_Id() {
			return Manager_Id;
		}



		public void setManager_Id(int manager_Id) {
			Manager_Id = manager_Id;
		}

		//toString method for Employees: 
		@Override
		public String toString() {
			return "Employee [Employee_FN=" + Employee_FN + ", Employee_LN=" + Employee_LN + ", Employee_EM="
					+ Employee_EM + ", Employee_RR=" + Employee_RR + ", Employee_Id=" + Employee_Id + ", Manager_Id="
					+ Manager_Id + "]";
		}
		
		
}
