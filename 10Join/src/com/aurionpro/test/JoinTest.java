package com.aurionpro.test;

public class JoinTest extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Thread " + i);
		}
	}

	public static void main(String args[]) {
		JoinTest t1 = new JoinTest();
		JoinTest t2 = new JoinTest();
		JoinTest t3 = new JoinTest();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}
