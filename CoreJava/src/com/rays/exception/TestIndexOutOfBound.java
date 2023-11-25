package com.rays.exception;

public class TestIndexOutOfBound {

	public static void main(String[] args) {
		String[] names= {"abc"};
		String name="abc";
		System.out.println(names[0]);
		
		System.out.println(name.charAt(5));
		

	}

}
