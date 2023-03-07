package com.aurionpro.test;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello World this is my project");
		
		System.out.println("Total Number of tokens is: "+st.countTokens());
		//The above Java code demonstrates the countTokens() method of StringTokenizer() class.
	  
		// printing next token single times
		System.out.println("\nNext Token is: "+st.nextToken(" "));
//		System.out.println("Next Token is: "+st.nextToken());
//		System.out.println("Next Token is: "+st.nextToken());
//		
		System.out.println("\nNext Element is: "+st.nextElement());
		//The above code demonstrates the use of nextElement() method.
		
		
		//printing remaining tokens in a loop
		//It checks if there is more tokens available.
		while(st.hasMoreTokens()) {
			
			//It returns the next token from the StringTokenizer object.
			System.out.println(st.nextToken());
			
		}
	//Difference Between nextElement()&nextToken()
//		//The nextElement() method of StringTokenizer class is also used to
//		 return the next token one after another from this StringTokenizer. 
//		It is similar to the nextToken() method, except that the return type 
//				is Object rather than the String
//		

		
		
	}

}
