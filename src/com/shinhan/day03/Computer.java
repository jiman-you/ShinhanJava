package com.shinhan.day03;

//javaBeans기술 규격서에 명시되어있다. 데이터는 외부에서 접근못하도록 정보은닉한다 = 캡슐화
//filed는 private정보은닉
public class Computer {
	private String model;
	private String os;
	private int price;
	static int count;//변수:instance변수-new하면 생김 , static변수(class변수)
	//count는 계속 세고싶으니까 static변수로 선언
	//생성자Overloading: 생성자 이름은 같고 매개변수 사양이 다르다.
	//하나의 생성자가 모양이 다른 생성자를 호출할 수 있다
	public Computer() {
		this("aa모델","Mac",500);
		
		}
	Computer(String model){
		this(model,null,0);
		}
	Computer(String os,int price){
		this(null,os,0);
	}
	Computer(String model,String os,int price){
		System.out.println("arg3생성자로 생성");
		this.model = model;
		this.os = os;
		this.price = price;
		count++;
	}
	//일반 메서드
	//함수로 정보를 주기위해 public으로 선언.
	public void printer() {
		System.out.println("model:"+model);
		System.out.println("os:"+os);
		System.out.println("price:"+price);
		
	}
	
	public String getModel() {
		return model;
	}
	public String getOs() {
		return model;
	}
	public String getPrice() {
		return model;
	}
}
