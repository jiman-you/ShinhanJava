package com.shinhan.day04;

import java.nio.channels.Pipe;

//class: object를 만들기위한 틀(설계도)
//object: class를 이용해서 만들어진 실체 (instance)
public class Caculator {
	// 1. field(특징, 속성, 변수): static(class변수), non-static(instance변수)
	private String color;
	private String model;
	static String company = "신한";
	private int price;

	// 2. 생성자(new할때 자동으로 실행되는 메서드)..컴파일시 자동으로 default생성자가 제공
	// 생성자는 초기화가 목적
	// 생성자를 정의하면 default생성자가 제공안됨
	Caculator(String color) {
		this(null, color, 0);
		// this: 이 클래스를 이용해서 만든 객체
		// 매개변수 이름과 멤버변수 이름이 충돌될때 사용
		// 하나ㅡ이 생성자가 다른 생성자를 호출할때 사용
	}

	// 생성자 Overloading: 이름은 같고 매개변수 사양이 다르다.
	Caculator(String model, String color) {
		this(model, color, 1000);
	}

	Caculator(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}

	// 3. method(일반 메소드)..기능(동사):static , non-static
	// static에서는 this 사용 불가- instance 생성없이 사용되는 메서드이므로 instance변수 사용불가
	// void: return 값이 없다.

//	//private로 정보은닉 되어있는 멤버변수들을 읽기 getter
//	public String getModel(){
//		return model;
//	}
//	public String getColor(){
//		return color;
//	}
//	public int getPrice(){
//		return price;
//	}
//	//private로 정보은닉 되어있는 멤버변수 변경 setter
//	public void setModel(String model){
//		this.model = model;
//	}

	void powerOn() {
		System.out.println(color + model + "전원을 켠다.");
		// return;
		// return 100;불가
	}

	void powerOff() {
		System.out.println(color + model + "전원을 끈다.");
	}

	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getCompany() {
		return company;
	}

	// 4.block(instance,static)
	{
		System.out.println("instance 생성시마다 수행된다");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	static {
		System.out.println("class로드시에 1회 수행된다.");
		System.out.println("**********************");
	}

	// 5.inner class
	class AA {

	}
}
