package com.shinhan.day05_2;

//abstract class:변수 + 상수 + 생성자 + 일반 메서드 + 추상 메서드
//규격서: 상수+추상메서드+ (default메서드+static메서드+private메서드)
public interface RemoteControl {
	public abstract void powerON();
	void powerOFF();
	default void display() {
		System.out.println("모든 구현 class에 기능추가");
	}
	static void display2() {
		System.out.println("모든 구현 class에 기능추가...재정의 불가, 인터페이스 소유");
	}
	
}
