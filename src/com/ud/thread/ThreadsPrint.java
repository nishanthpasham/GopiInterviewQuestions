package com.ud.thread;

public class ThreadsPrint implements Runnable {

	Thread t1 = new Thread() {
		public void run() {
			printEvenNumbers();
		}
	};
	
	Thread t2 = new Thread() {
		public void run() {
			printOddNumbers();
		}
	};
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadsPrint tp = new ThreadsPrint();
		tp.t1.start();
		tp.t1.sleep(10000);
		
		tp.t2.start();
	}
	
	int numberOfTimesCalled = 0;
	
	@Override
	public void run() {
		if(numberOfTimesCalled % 2 == 0) {
			printEvenNumbers();
		} else {
			printOddNumbers();
		}
		numberOfTimesCalled++;
	}

	private void printEvenNumbers () {
		System.out.println("Printing even numbers");
		for(int i = 1; i < 25; i++) {
			System.out.println(i*2);
		}
	}
	
	private void printOddNumbers () {
		System.out.println("Printing odd numbers");
		for(int i = 1; i < 26; i++) {
			System.out.println(i*2 - 1);
		}
	
	}
	
}
