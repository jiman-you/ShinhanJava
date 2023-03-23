package com.shinhan.day03;

public class CarTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		//자동차 객체를 만든다.
		//1.객체참조변수선언
		int a;//a변수에 int타입의 값을 담을 수 있다.
		Car car1;//car1변수에 car타입의 객체를 담을 수 있다.
		Car car2;//car2변수에 car타입의 객체를 담을 수 있다.
		
		//2.객체생성..힙에 객체가 생성되고 주소는 변수에 담는다.
		//객체가 생성되면 변수들은 자동 초기화.
		car1 = new Car();
		car2 = new Car();
		
		//3.객체사용
		car1.model ="a모델";
		car1.color = "black";
		car1.price = 30;
		
		
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.price);
	
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.price);
		
		car1.go();
		car2.go();
	}

}
