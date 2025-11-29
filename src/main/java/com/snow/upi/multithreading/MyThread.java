package com.snow.upi.multithreading;

public class MyThread extends Thread{
	@Override
	public void run () {
		for(int  j = 1; j<= 10 ; j++) {
			System.out.println("Thread : "+ j);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
