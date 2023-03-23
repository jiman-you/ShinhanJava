package com.shinhan.day09;

//공유영역
public class WorkObject {
	public synchronized void methodA() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":methodA작업실행");
		notify();//자는애있으면 깨워줘
		try {
			wait();//나는 잘개
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void methodB() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+":methodB작업실행");
		notify();//자는애있으면 깨워줘
		try {
			wait();//나는 잘개
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
