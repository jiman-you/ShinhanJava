package com.shinhan.day04;

public class Sparrow {
//	나타내는 name과 다리의 수를 나타내는 legs, 몸길이를 나타내는 length 데이터를 가지고 있다
	String name;
	int legs;
	int length;
	
	Sparrow(String name, int legs,int length){
		this.name =name;
		this.legs = legs;
		this.length =length;
	}
//	메소드로는 날다 fly , 
//	울다 sing, 
//	이름기록하기 setName, 
//	문자열출력하기 toString를 가지고 있다.
	void fly(){
		System.out.println("참새("+name+")는 납니다.");
	}
	void sing(){
		System.out.println("참새("+name+")가 소리내어 웁니다.");
			
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String disPlay(){
		System.out.println("참새의 이름은 "+name+"입니다. 다리는"+legs+"개이고 길이는 "+length+"입니다");
		return null;
	}
}
