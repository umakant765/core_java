package in.com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Testmarksheet {

	public static void main(String[] args) {
		
		ArrayList list= new ArrayList();
		list.add(new Marksheet(1, "umesh", 100));
		list.add(new Marksheet(2, "satyam", 200));
		list.add(new Marksheet(3, "aman", 300));
		list.add(new Marksheet(4, "rahul", 400));
		list.add(new Marksheet(5, "rohit", 500));
		
		
      Collections.sort(list);
      for (Object object : list) {
    	  
    	  System.out.println(object);
		
	}
      
	}

}
