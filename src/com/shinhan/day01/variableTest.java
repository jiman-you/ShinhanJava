package com.shinhan.day01;

//class=변수+함수

//variableTest.java -> 컴파일 variableTest.class
//실행
//1.JVM이 variableTest class Loader에 의해 Load (static이 method영역에 Load)
//2. 검증
//3.main시작

public class variableTest {
	
	int score;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.변수선언
		int a;//지역변수= 이 함수 내부에서만 사용가능
		//System.out.println(a);//초기화하지않으면 사용불가
		//System.out.println(score);//static이 non-static사용불가
		
		//2.변수사용
		a = 10;
		System.out.println(a);//읽기
		System.out.println(a+10);//읽기
		
		//3.선언+사용
		int a2=30;
		System.out.println(a2);
		
	}
	
}
