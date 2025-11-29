package com.snow.upi.multithreading;

public class multithreading {
	public static void main(String[] args) {
		MyThread obj = new MyThread();
		obj.start();
		MyRunnable obj1 = new MyRunnable();
		Thread thread = new Thread(obj1);
		thread.start();
		
	}
}

