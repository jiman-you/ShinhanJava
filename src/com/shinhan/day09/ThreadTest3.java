package com.shinhan.day09;

public class ThreadTest3 {
	public static void main(String[] args) {
		System.out.println("메인스레ㅡㄷ시작");

		MyThread1 t1 = new MyThread1("대문자 출력Thread");
		MyThread1 t2 = new MyThread1("숫자 출력Thread");
		Runnable r = new MyThread3();
		Thread t3 = new Thread(r);
		System.out.println("t1:"+t1.getState().name());
		System.out.println("t2:"+t2.getState().name());
		System.out.println("t3:"+t3.getState().name());
		t3.setName("소문자 출력 Thread");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("t1:"+t1.getState().name());
		System.out.println("t2:"+t2.getState().name());
		System.out.println("t3:"+t3.getState().name());
		
		System.out.println("메인스레ㅡㄷ끝");
	}
}
