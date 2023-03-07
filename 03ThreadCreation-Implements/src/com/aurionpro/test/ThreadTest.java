package com.aurionpro.test;

import com.aurionpro.model.Threads;

public class ThreadTest {

	public static void main(String[] args) {
		Threads t1 = new Threads();
		Thread thread = new Thread(t1);
		thread.start();

	}
}