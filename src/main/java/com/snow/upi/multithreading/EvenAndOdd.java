package com.snow.upi.multithreading;

public class EvenAndOdd {
	private int a = 1 ;
	public static final int limit = 10 ;
	
	
	public synchronized void oddInc() {
		while(a<limit ) {
			while(a%2 == 0 ) {
				try {wait();} catch(Exception e ) {}
			}
			System.out.println("odd thread : "+ a);
			a++;
			notify();
		}
	}
	
	public synchronized void evenInc() {
		while(a<limit ) {
			while(a%2 != 0 ) {
				try {wait();} catch(Exception e ) {}
			}
			System.out.println("even thread : "+ a);
			a++;
			notify();
		}
	}
	public static void main(String[] args) {
		EvenAndOdd o  = new EvenAndOdd();
		
		Thread d = new Thread(()->{
			o.oddInc();
		});
		Thread c = new Thread(o::evenInc);
		
		d.start();
		c.start();
	}

}
