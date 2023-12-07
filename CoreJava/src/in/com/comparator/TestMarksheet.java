package in.com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class TestMarksheet {

	public static void main(String[] args) {
		
		List list= new ArrayList();
		list.add(new Marksheet(1, "umesh", 200));
		list.add(new Marksheet(2, "umesh", 200));
		list.add(new Marksheet(3, "aman", 300));
		list.add(new Marksheet(4, "rahul", 400));
		list.add(new Marksheet(5, "rohit", 500));
		
		
      Collections.sort(list, new OrderByNameDesc());
      for (Object object : list) {
    	  
    	  System.out.println(object);
		
	}
	}

}
