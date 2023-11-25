package com.rays.exception;

public class TestMultipleCatch {

	public static void main(String[] args) {
		try {
			String name="abc";
			System.out.println(name.length());
			System.out.println(name.charAt(5));
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("division=" +c);
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmatic exception");
		}catch(NullPointerException e) {
			System.out.println("null pointer excetion");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("index out of bound");
		}catch(Exception e) {
         System.out.println("exception");
	}
		System.out.println("after try catch");

}}
