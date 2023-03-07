package com.aurionpro.model;

public class Threads extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("Task -> " + i);

		}
		System.out.println();
	}
}
