package com.shinhan.day06;

//Exption을 상속받으면 사용자정의로 만들수있음
//사용자 정의 예외
//만드는 이유: 업무상Exception 처리를 일관성있게 하기위해 만든다.
//Exception을 상속받아야한다. 
//Exception - 일반예외-강제성
//RuntimeException-실행예외
public class LoginException extends Exception{
	
	public LoginException(String err) {
		super(err);
	}
	public void PrintMessage() {
		System.out.println("로그인:"+getMessage());
	}
}
