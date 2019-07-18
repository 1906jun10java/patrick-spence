package com.project1.beans;

public class Manager {
		
		//Manager Class no-args Constructor: 
		public Manager() {
			
		}
		
		//Manager Class Constructor w/ fields:
		public Manager(String manager_FN, String manager_LN, String manager_EM, String manager_RR, int manager_Id) {
			super();
			Manager_FN = manager_FN;
			Manager_LN = manager_LN;
			Manager_EM = manager_EM;
			Manager_RR = manager_RR;
			Manager_Id = manager_Id;
		}



		//Manager Class fields: 
		private String Manager_FN;
		private String Manager_LN;
		private String Manager_EM;
		private String Manager_RR;
		private int Manager_Id;
		
		//Manager Class Getters and Setters: 
		public String getManager_FN() {
			return Manager_FN;
		}
		public void setManager_FN(String manager_FN) {
			Manager_FN = manager_FN;
		}
		public String getManager_LN() {
			return Manager_LN;
		}
		public void setManager_LN(String manager_LN) {
			Manager_LN = manager_LN;
		}
		public String getManager_EM() {
			return Manager_EM;
		}
		public void setManager_EM(String manager_EM) {
			Manager_EM = manager_EM;
		}
		public String getManager_RR() {
			return Manager_RR;
		}
		public void setManager_RR(String manager_RR) {
			Manager_RR = manager_RR;
		}
		public int getManager_Id() {
			return Manager_Id;
		}
		public void setManager_Id(int manager_Id) {
			Manager_Id = manager_Id;
		}
		
		//Manager Class toString: 
		@Override
		public String toString() {
			return "Manager [Manager_FN=" + Manager_FN + ", Manager_LN=" + Manager_LN + ", Manager_EM=" + Manager_EM
					+ ", Manager_RR=" + Manager_RR + ", Manager_Id=" + Manager_Id + "]";
		}
		
		
		
}
