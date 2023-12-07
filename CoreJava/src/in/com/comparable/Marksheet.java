package in.com.comparable;

public class Marksheet implements Comparable<Marksheet>{
	
	private int id;
	private String name;
	private int marks;
	 public Marksheet(int id,String name,int marks) {
		this.id= id;
		this.name= name;
		this.marks= marks;
	}

	@Override
	public int compareTo(Marksheet m1) {
		
		//return this.name.compareTo(m1.name);
		return this.id-m1.id;
				
	}

	@Override
	public String toString() {
		
		return id+"  " +name+ "  "  +marks;
	}
}
