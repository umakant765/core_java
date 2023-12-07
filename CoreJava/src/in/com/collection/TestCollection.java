package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		Collection c1= new ArrayList();
	     
		c1.add(100);
		c1.add("umesh");
		c1.add(500);
System.out.println(c1);

Collection c2= new ArrayList();
         c2.add(500);
         c2.add(200);
         c2.add("neha");
         System.out.println(c2);
         
         c1.addAll(c2);
         System.out.println(c1);
         //c2.clear();
//System.out.println(c2);
c1.contains(500);
System.out.println(c1);
c1.isEmpty();
System.out.println(c1);
c1.remove("umesh");
System.out.println(c1);
c1.size();
System.out.println(c1);

	}}
