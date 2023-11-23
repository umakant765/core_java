package com.rays.opp;

public class TestPerson1 {

	public static void main(String[] args) {
		Person1 p= new Person1();
		p.setId(10);
		p.setFirstName("umesh");
		p.setLastName("choudhary");
System.out.println(p.getId());
System.out.println(p.getFirstName());
System.out.println(p.getLastName());
System.out.println(Person1.AVG_AGE);
	}

}
