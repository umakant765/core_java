package com.rays.constructorcalling;

public class Employee extends Person {
	private String designation;
	public Employee()
	{
	System.out.println("emplyee default con..");
	}
	public Employee(String firstName,String lastName, String designation) {
		super(firstName,lastName);
		this.designation=designation;
		System.out.println("employee 1 parameter con..");
		
	}
	public String getDesignation() {
		return designation;
	}public void setDesignation(String designation) {
		this.designation = designation;
	}
}
