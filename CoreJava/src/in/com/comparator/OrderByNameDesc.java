package in.com.comparator;

import java.util.Comparator;

public class OrderByNameDesc implements Comparator<Marksheet>{

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		
		return m2.name.compareTo(m1.name);
	}

	

	
}
