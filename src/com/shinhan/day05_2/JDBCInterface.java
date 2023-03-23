package com.shinhan.day05_2;

//interface : 규격서-정의는 있고, 구현은 없다
public interface JDBCInterface {
	//1. 상수(변수는 불가)
	//public static final String JDBC= "JAVA Database Connection";
	//public static final 생략가능
	String JDBC= "JAVA Database Connection";
	String JDBC2= "JAVA Database Connection";
	
	//2. 추상메서드
	public abstract void dbConnect(String dbName);
	//public abstract 생략가능
	void dbConnect2(String dbName);

	//3.상위버전에서 추가된 - dafault method
	default void select() {
		System.out.println("default method: 인터페이스를 구현한 모든 class의 공통코드");
		System.out.println("구현 class에서 재정의 가능하다");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
	}
	//4.상위버전에서 추가된 - static method
	static void update() {
		System.out.println("static method: 인터페이스 소유의 코드");
		System.out.println("구현class에서 재정의 불가능하다");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
	}
	//5.private: default에서 호출
	private void insert1() {
		System.out.println("mmmmmmmm");
	}
	private static void insert2() {
		System.out.println("mmmmmmmm");
	}
}
