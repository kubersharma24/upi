package com.snow.upi.multithreading;
public class EvenOddPrinter {

//    private int number = 1;
//    private final int limit = 10;
//
//    public synchronized void printOdd() {
//        while (number <= limit) {
//            while (number % 2 == 0) { 
//                try { wait(); } catch (InterruptedException e) { }
//            }
//            System.out.println("Odd Thread: " + number);
//            number++;
//            notify();
//        }
//    }
//
//    public synchronized void printEven() {
//        while (number <= limit) {
//            while (number % 2 != 0) {
//                try { wait(); } catch (InterruptedException e) { }
//            }
//            System.out.println("Even Thread: " + number);
//            number++;
//            notify();
//        }
//    }
//
//    public static void main(String[] args) {
//        EvenOddPrinter printer = new EvenOddPrinter();
//
//        Thread t1 = new Thread(printer::printOdd);
//        Thread t2 = new Thread(printer::printEven);
//
//        t1.start();
//        t2.start();
//    }
	
}
