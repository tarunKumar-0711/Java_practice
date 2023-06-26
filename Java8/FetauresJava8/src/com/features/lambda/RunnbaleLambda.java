package com.features.lambda;

public class RunnbaleLambda {
	public static void main(String args[]) {
		
		Runnable thread1 = () -> {
			System.out.println("Thread 1");
		};new Thread(thread1).start();
		
		new Thread( () -> {System.out.println("Thread 1");
		}).start();
		
		new Thread( new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 3");
			}
		}).start();
	}
}

