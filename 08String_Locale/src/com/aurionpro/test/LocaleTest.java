package com.aurionpro.test;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale l1 = new Locale("HI", "INDIA");

		System.out.println("Locale: " + l1);

		System.out.println("Language: " + l1.getDisplayName());

		System.out.println("Country Name: " + l1.getCountry());

		System.out.println("HashCode for Locale: " + l1.hashCode());

	}

}