package com.aurionpro.test;

public class ThreadTest {

	public static void main(String[] args) {

		// Anonymous Runnable Class
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable anonymous class");
			}

		});
		myThread.start();

		// Using Lambda
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		myLambdaThread.start();
	}

}