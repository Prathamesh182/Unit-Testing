package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Threads;

public class ThreadTest {

	public static void main(String[] args) {

		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("Number of Processers: " + count);

		//ExecutorService service = Executors.newSingleThreadExecutor();
		//ExecutorService service = Executors.newFixedThreadPool(3);
		ExecutorService service = Executors.newCachedThreadPool();

		service.execute(new Threads());
		service.execute(new Threads());
		service.execute(new Threads());
		
		

		service.shutdown();
	}

}
