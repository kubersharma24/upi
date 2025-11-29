package com.snow.upi.multithreading;
class RaceConditionDemo extends Thread{
	
    private static int counter = 0;
    
    @Override
    public void run() {
    	for (int i = 0; i < 10000; i++) increment();
    }

    public void increment() {
        counter++; // NOT thread-safe
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionDemo t1 = new RaceConditionDemo();
        RaceConditionDemo t2 = new RaceConditionDemo();

        

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Counter (race condition): " + counter +" : "+ t2.counter);
    }
}
