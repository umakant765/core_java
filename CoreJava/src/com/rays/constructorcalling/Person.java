package com.rays.constructorcalling;

public class Person {
	private String firstName;
	private String lastName;
	private String adress; 
	
	public Person() {
		System.out.println("person default constructor");
	}
	public Person(String firstName,String lastName) {
		this();
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("person 1 parameter cons..");
	}
	public Person(String firstName, String lastName,String adress) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.adress=adress;
		System.out.println("person 2 parameter con..");
	}
	public String getFirstName() {
		return firstName;
	}
 public void setFirstName(String firstName) {
	this.firstName = firstName;
}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}
