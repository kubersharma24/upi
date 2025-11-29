package com.snow.upi.multithreading;

public class MyRunnable implements Runnable {
	@Override
	public void run () {
		for(int  j = 1; j<= 10 ; j++) {
			System.out.println("Runnable : "+ j);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
