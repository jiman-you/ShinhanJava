package com.shinhan.day05_2;

//인터페이스 구현클래스
public class Audio implements RemoteControl,WIFI {

	@Override
	public void powerON() {
		System.out.println(getClass().getSimpleName() + "전원켠다");
	}
	@Override
	public void powerOFF() {

		System.out.println(getClass().getSimpleName() + "전원끈다");

	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		RemoteControl.super.display();
		System.out.println("default method 재정의");
	}
	void display2() {

		System.out.println("!@#!@#!@#");
	}
	@Override
	public void wifiTrunON() {
		System.out.println("wifi turn on");
	}
}
