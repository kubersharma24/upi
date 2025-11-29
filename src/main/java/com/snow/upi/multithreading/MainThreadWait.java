package com.snow.upi.multithreading;

public class MainThreadWait {
	public static void main(String[] args) {
		Thread a = new Thread(()->{
			System.out.println("thread a : start");
			try {Thread.sleep(1000);}catch(Exception e) {}
			System.out.println("thread a : Ended");
		});
		Thread b = new Thread(()->{
			System.out.println("thread b : start");
			try {Thread.sleep(1500);}catch(Exception e) {}
			System.out.println("thread b : Ended");
		});
		a.start();
		b.start();
		
		System.out.println( "******main T start******");
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "******main T end******");
		
	}

}
