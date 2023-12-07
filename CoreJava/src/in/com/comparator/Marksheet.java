package in.com.comparator;

import java.util.Comparator;

public class Marksheet implements Comparator<Marksheet>{
		
		public int id;
		public String name;
		public int marks;
		 public Marksheet(int id,String name,int marks) {
			this.id= id;
			this.name= name;
			this.marks= marks;
		}
    
           
           
		
	

		@Override
		public String toString() {
			
			return id+"  " +name+ "  "  +marks;
		}

		@Override
		public int compare(Marksheet m1, Marksheet m2) {
			if(this.name.compareTo(m1.name)==0);
			{
	        	   if(this.marks-m1.marks==0);
	        	   return this.id-m1.id;
			
		}}
		}     


		
		

	
	



