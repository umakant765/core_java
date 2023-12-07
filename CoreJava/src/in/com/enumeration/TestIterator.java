package in.com.enumeration;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class TestIterator {

	public static void main(String[] args) {
	
		ArrayBlockingQueue list= new ArrayBlockingQueue(10);
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		Iterator it=list.iterator();
		list.add(5000);
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		} {
			
			
		}

	}

}
