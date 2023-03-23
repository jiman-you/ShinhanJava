package com.shinhan.ch14_exm;

public class ThreadExample {
	public static void main(String[] args) {
		exm6();
		
	}

	private static void exm6() {
		Thread thread = new MovieThread();
		
		thread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
		
	}

	private static void exm2() {
		Thread t1 = new MovieThread();
		t1.start();
		
		Thread t2 = new Thread(new MusicRunnable());
		t2.start();
	}

	
}
