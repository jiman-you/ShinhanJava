package com.shinhan.day04;
//public: 모튼 패키지에서 접근가능
//proteced: 같은 패키지 접근가능 , 다른 패키지는 상속받으면 가능 
//생략:같은 패키지에서만 접근가능
//private:같은 class에서만 접근가능
public class Phone {
	//1/filed public/proteced/생략/private
	//2.새성자 :public생략
	public String model;
	public Phone() {
		System.out.println("defaulf에 정이");
	}
	
	//3.메서드
	public void f1() {
		
	}
	protected f2() {
		
	}
	void f3() {
		
	}
	private f4() {
		
	}
}
