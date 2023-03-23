package com.shinhan.day09;

public class ThreadTest4 {
	public static void main(String[] args) throws InterruptedException {
		f9();
	}
	private static void f9() {
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true);//메인 스레드 종료시 데몬도 종료
		at.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}
	//interrupt()를 이용한 종료 2
	private static void f8() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();
		
	}
	//while문을 이용한 스레드종료
	//interrupt()를 이용한 종료
	private static void f7() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt();;
		//t1.stop사용하지말아라
	}
	//Thread에서 다른 Thread에게 신호보내기 wait() notify()
	private static void f6() {
		WorkObject wobj = new WorkObject();
		ThreadA tA = new ThreadA(wobj);
		ThreadB tB = new ThreadB(wobj);
		
		tA.start();
		tB.start();
		
	}
	//동기화
	private static void f5() {
		ShareArea share = new ShareArea(
				new Account("12345","성춘향",1000),
				new Account("6789","이몽룡",2000)
				);
		transferThread tf = new transferThread(share);
		PrintThread pt = new PrintThread(share);
		tf.start();
		pt.start();
		
		
		
	}
	//동기화
	private static void f4() {
		User1Thread t1 = new User1Thread();
		User2Thread t2 = new User2Thread();
		//2개의 스레드가 공유영역
		Calculator cal = new Calculator();
		
		t1.setCacluator(cal);
		t2.setCacluator(cal);
		
		t1.start();
		t2.start();
		
	}

	//동기화(공유영역을 하나의 스레드가 사용중일때 다른 스레드가 접근하는걸 막음) 
	private static void f3() {
		BathRoom bathroom = new BathRoom();
		BathThread t1 = new BathThread(bathroom, "김씨");
		BathThread t2 = new BathThread(bathroom, "박씨");
		BathThread t3 = new BathThread(bathroom, "정씨");
		BathThread t4 = new BathThread(bathroom, "최씨");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}

	private static void f2() {//join테스트
		SumThread t1 = new SumThread(1,50);
		SumThread t2 = new SumThread(51,100);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();//흐름을 기다려야 하는 상황에서 조인사용
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.getSum()+t2.getSum());
		System.out.println("main end...");
		
		
	}

	private static void f1() throws InterruptedException {//yield테스트
		WorkThread t1 = new WorkThread("[쓰레드A]");
		WorkThread t2 = new WorkThread("[쓰레드B]");
		t1.start();
		t2.start();
		//5초간 일시정지
		Thread.sleep(5000);
		//t1의 work를 false..t1스레드가 다른 쓰레드에 양보
		t1.work = false;
		//10초후
		Thread.sleep(10000);
		//t1의 work를 true
		t1.work = true;
	}
}
