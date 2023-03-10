package com.aurionpro.test;

public class BufferTest {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("Hello");
		System.out.println(s1.capacity());
		s1.append("My Name is Prathamesh");
		System.out.println(s1.capacity());
		System.out.println(s1);
		
		
		s1.replace(1, 2, "Hey");
		System.out.println(s1);
		
		s1.insert(3, "Hello");
		System.out.println(s1);
		
		s1.delete(1, 2);
		System.out.println(s1);	
		
		s1.reverse();
		System.out.println(s1);
		
		//StringBuffer is synchronized i.e. thread safe It means two threads can't call the methods of StringBuffer simultaneously.
		//. StringBuilder is non-synchronized i.e. not thread safe.It means two threads can call the methods of StringBuffer simultaneously.
		
	}

}
