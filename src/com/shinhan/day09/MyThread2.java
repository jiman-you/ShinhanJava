package com.shinhan.day09;

//멀티쓰레드 만드는 방법
//1.상속받기 extends Thread... run()메소드 재정의하여 구현

public class MyThread2 extends Thread{

		public MyThread2() {}
		
		public MyThread2(String threadname) {
			super(threadname);
		}
	@Override
	public void run() {
		for(char i='A';i<='Z';i++) {
			System.out.println("["+getName()+"]"+"i="+i);
		}
		
	}
	
	
}
