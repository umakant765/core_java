package in.com.propagation;

public class TestMistakeException {

	public static void main(String[] args) {
		try {
      dad(); 
      } catch(MistakeException e) {
    	  e.printStackTrace();
      }
		
      
	}
	public static void dad() throws MistakeException{
		mom();
	}
	public static void mom() throws MistakeException {
		son();
		
	}public static void son() throws MistakeException {
		throw new MistakeException();
	}
	

}
