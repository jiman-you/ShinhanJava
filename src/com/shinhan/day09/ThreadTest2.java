package com.shinhan.day09;

public class ThreadTest2 {
	public static void main(String[] args) {
		f1();
		System.out.println("메인종료");
	}

	private static void f1() {
		//Thread를 익명구현객체로 만들기
//		Thread t1 = new MyThread1();
//		Runnable r = new MyThread3();//Runnable 타입의 객체를 만들어 Thread의 매개값으로 넣어 생
//		Thread t3 = new Thread(r);
		Thread t1 = new Thread(){
			@Override
			public void run() {
				for(int i=1;i<=26;i++) {
					System.out.println("["+getName()+"]"+"i="+i);
					try {
						sleep((long) (Math.random()*100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(char i='A';i<='Z';i++) {
					System.out.println("["+getName()+"]"+"i="+i);
				}
				
			}
		};
		t2.start();
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(char i='a';i<='z';i++) {
					System.out.println(Thread.currentThread().getName()+"i="+i);
					try {
						Thread.sleep((long) (Math.random()*100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t3.start();
	}
	
	
}
