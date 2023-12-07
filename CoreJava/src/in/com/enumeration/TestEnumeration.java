package in.com.enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		
		Enumeration e= v.elements();
		v.add(400);
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		

	}

}
