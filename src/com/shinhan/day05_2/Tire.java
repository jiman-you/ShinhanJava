package com.shinhan.day05_2;

//abstrack class: 추상 메서드가 1개이상있다.
public abstract class Tire {
	//추상메서드: 정의는 있고 구현은 없다.구현은 상속받은 자식클래스가 반드시 한다.(오버라이드의무)
	//오버라이드
	public abstract void roll();
	
	void f1() {
		System.out.println("타이어에프일");
	}
}
