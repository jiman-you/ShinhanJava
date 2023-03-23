package com.shinhan.day09;

//공유영역 synchronized = 락걸기- 동기화
public class BathRoom {
	boolean isfirst = true;
	public void use(String name) {
	synchronized(this) {
		if(isfirst&&name.equals("김씨")) {
			try {
				wait();//처음이고 김씨면은 일시정지시켜
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		isfirst = false;
		System.out.println(name+"입장한다");
		System.out.println(name+"사용한다");
		System.out.println(name+"퇴장한다");
		System.out.println("===============");
		notifyAll();//일시정지상태인 애가 있으면 실행대기시켜 -신호를 보낸다. wait()상태에 있는 Thread가 실행대기상태로 변경 
		}
	}
	
	
	
	
	/*
	public synchronized void use(String name) {
		System.out.println(name+"입장한다");
		System.out.println(name+"사용한다");
		System.out.println(name+"퇴장한다");
		System.out.println("===============");
	}*/
	
}
