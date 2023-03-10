package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Jay");
		list.add("Mahesh");
		// list.add(32);compile time error

		String s = list.get(1);// type casting is not required
		System.out.println("Element is: " + s);

		//executing other elements in loop
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
