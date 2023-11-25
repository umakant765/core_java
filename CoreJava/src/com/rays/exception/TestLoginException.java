package com.rays.exception;

public class TestLoginException {

	public static void main(String[] args) {
		String name="admi";
		if(name.contentEquals("admin")) {
			System.out.println("user is valid");
		}else {
			try {
				throw new LoginException();
			
			
		}catch(LoginException e) {
			System.out.println(e.getMessage());
		}

	}

}
}