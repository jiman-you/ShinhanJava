package com.shinhan.day03;

//class: 설계도 = object(객체)를 만드는 틀
//object: class를 이용해서 만든 개체(실체의 instance)

public class Car {
	//1.field(속성,변수)
	String model;
	String color;
	int price;
	//2.생성자메서드: 생성시 초기화가 목적
	//컴파일시에 자동으로 .class에 파라메터가 없는 default생성자가 만들어진다.
	//즉 생성자를 정의하는 것은 필수가 아니다.
	//생성자는 반드시 클래스 이름과 같아야한다.
	public Car(){//생성자는 리턴정의가 없다.
		System.out.println("Car의 default생성자");
	}
	
	//3.일반메서드: method, 기능,동작
	void go() {
		System.out.println("부릉부릉");
	}
	
	//4.block(instance block, static block)생성자보다 먼저실행
	{
		System.out.println("instance block...생성시에 시작");
	}
	static {
		System.out.println("static bolck...class Load 1si");
	}
	
	//5.inner Class
	

}
