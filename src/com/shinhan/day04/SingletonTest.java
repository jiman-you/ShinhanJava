package com.shinhan.day04;

public class SingletonTest {

	public static void main(String[] args) {
		MyServlet a = MyServlet.getInstance();
		MyServlet b = MyServlet.getInstance();
		
		System.out.println(a);
		a.print();
		a.print2();
		b.print2();
	}

}
