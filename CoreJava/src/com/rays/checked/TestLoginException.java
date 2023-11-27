package com.rays.checked;

import com.rays.exception.LoginException;

public class TestLoginException {

	public static void main(String[] args) {
	
		String name="admi";
		if(name.equals("admin")) {
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
