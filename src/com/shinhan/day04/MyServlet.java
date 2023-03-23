package com.shinhan.day04;

//Servlet: JAVA(주인공) +HTML , 서버에서 수행되는 자바 프로그램
//JSP:HTML(주인공) + JAVA, JSP -> Servlet변경된다.
//Servlet은 싱글톤으로 동작한다.-> new를 1회만 시행
public class MyServlet {
	private static MyServlet my;//객체 생성을 못하니 미리 로드시켜놓음
	
	private MyServlet(){
		System.out.println("MyServlet이 생성된");
	}
	public static MyServlet getInstance() {
		if(my == null) {
			my = new MyServlet();
		}
		return my;
	}
	public void print() {
		System.out.println("싱글톤연습");
		
	}
	public void print2() {
		System.out.println("싱글톤연습2");
		
	}
	public void print3() {
		System.out.println("싱글톤연습3");
		
	}
}
