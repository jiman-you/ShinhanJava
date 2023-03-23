package com.shinhan.day04;

//자바의 최상위 class:object(toString,equals....)

public class Duck {
//	나타내는 name과 다리의 수를 나타내는 legs, 몸길이를 나타내는 length 데이터를 가지고 있다
	String name;
	int legs;
	int length;
	
	Duck(String name, int legs,int length){
		this.name =name;
		this.legs = legs;
		this.length =length;
	}
//	메소드로는 날다 fly , 
//	울다 sing, 
//	이름기록하기 setName, 
//	문자열출력하기 toString를 가지고 있다.
	void fly(){
		System.out.println("오리("+name+")는 날지 않습니다.");
	}
	void sing(){
		System.out.println("오리("+name+")가 소리내어 웁니다.");
			
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String disPlay(){
		System.out.println("오리의 이름은 "+name+"입니다. 다리는"+legs+"개이고 길이는 "+length+"입니다");
		return null;
	}
	//Override(덮어쓰기, 재정의): 이미 가지고있는 기능을 재정의
	//이름, 매개변수, 리턴 등 모두 같아야 재정의
	//단, 접근제한자는 같거나 더 넓어져야한다.private<protected<default<public
	@Override
	public String toString() {
		return "Duck [name=" + name + ", legs=" + legs + ", length=" + length + "]";
	}

}
