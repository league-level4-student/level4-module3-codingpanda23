package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	//divide method
	public void divide(double dividend, double divisor) {
		if(divisor == 0.0) {
			throw new IllegalArgumentException(); 
		}
	}
	//reverse method
	public void reverseString(String s) {
		
	}
	
}
