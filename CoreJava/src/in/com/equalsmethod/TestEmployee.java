package in.com.equalsmethod;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1= new Employee(1, "abc", 5000);
		Employee e2= new Employee(1, "abc", 5000);
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		

	}

}
