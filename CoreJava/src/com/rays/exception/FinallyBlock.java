package com.rays.exception;

public class FinallyBlock {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println("division=" +c);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block");
		}
		System.out.println("after");

		// TODO Auto-generated method stub

	}

}
