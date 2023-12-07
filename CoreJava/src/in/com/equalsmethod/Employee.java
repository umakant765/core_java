

package in.com.equalsmethod;

public class Employee {

	private int id;
	private String name;
	private int salary;

	public Employee(int id,String name,int salary) {

		this.id= id;
		this.name= name;
		this.salary= salary;
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public int hashCode() {
		String str= id+ name+ salary;
		return str.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
	Employee e=(Employee) obj;
	boolean b= this.id==e.id && this.name==e.name && this.salary==e.salary;
		return b;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+salary;
	}
}   


