package com.mutations;

public class Bank {
	
	

	public Bank() { //no-arg constructor
		super();
	}
	
	public Bank(String start, String end) {//constructor 
		this.start = start;
		this.end = end;
	}
	//private variable
	private String start;
	private String end;
	

	//getters and setters 
	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}
	
	public String getEnd() {
		return end;
	}
	
	public void setEnd(String end) {
		this.end = end;
	}
	
	
}
