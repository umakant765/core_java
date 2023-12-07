package in.com.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
	  List l =new ArrayList();
	  l.add(null);
	  l.add(0, 100);
	  l.add(1, 200);
	  l.add(2, 300);
	  l.add(3, "umesh");
	  System.out.println(l);
	  l.addAll(l);
	  System.out.println(l);
l.clear();
System.out.println(l);


	}

}
