package com.snow.upi.multithreading;

public class ABC {
	private int count = 1 ;
	private int c = 1 ;
	private int limit = 8;
	public synchronized void a () {
		while(count < limit ) {
			while(c != 1 ) {
				try {wait();}catch(Exception e ) {}
			}	
			System.out.println("a :");
			count++;
			c++;
			notifyAll();
		}
		
	}
	public synchronized void b () {
		while(count <limit ) {
			while(c != 2 ) {
				try {wait();}catch(Exception e ) {}
			}	
			System.out.println("b :");
			count++;
			c++;
			notifyAll();
		}
		
	}
	public synchronized void c () {
		while(count <limit ) {
			while(c != 3 ) {
				try {wait();}catch(Exception e ) {}
			}	
			System.out.println("c :");
			count++;
			c++;
			if(c>3){
				c=1;
			}
			notifyAll();
		}
		
	}
	public static void main(String[] args) {
//		char a = 'a';
//		int c = a ;
//		System.out.println((char)(c+1));
//		System.out.println(a);
//		System.out.println(Character.valueOf(a)-'a');
		ABC a = new ABC();
		
		Thread aa = new Thread(a::a);
		Thread bb = new Thread(a::b);
		Thread cc = new Thread(a::c);
		aa.start();
		bb.start();
		cc.start();
	}

}
