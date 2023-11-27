package in.com.unchecked;

import com.rays.exception.LoginException;

public class TestLoginException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


