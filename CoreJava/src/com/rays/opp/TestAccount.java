package com.rays.opp;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a= new Account();
        a.setAccountNumber("sb12345");
        a.setBalance(5000);
        
        System.out.println(a.getAccountNumber());
	System.out.println(a.getBalance());
	
}
}