package _02_gotta_catchem_all;

import java.util.Stack;

public class ExceptionMethods {
	
	//divide method
	public void divide(double dividend, double divisor) {
		if(divisor == 0.0) {
			throw new IllegalArgumentException(); 
		}
	}
	//reverse method
	public void reverseString(String s) {
		Stack<String> word = new Stack<String>();
		for(int i = 0; i < s.length(); i--) {
			word.push(s);
			String t = word.pop();
			System.out.println(t);
		}
	}
	
}
