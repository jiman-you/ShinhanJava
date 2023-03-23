package com.shinhan.day05_2;

//인터페이스 구현클래스
public class Television implements RemoteControl {

	@Override
	public void powerON() {
		System.out.println(getClass().getSimpleName() + "전원켠다");
	}

	@Override
	public void powerOFF() {

		System.out.println(getClass().getSimpleName() + "전원끈다");

	}

}
