package com.aurionpro.test;

public class BuilderTest {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Hello");
		s1.append("There");
		System.out.println(s1);
		s1.insert(1,"Java");
		System.out.println(s1);

	}

}
