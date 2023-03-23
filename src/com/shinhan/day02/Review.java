package com.shinhan.day02;

public class Review {

	public static void main(String[] args) {
		System.out.println("main시작");
		f1();

	}

	private static void f1() {
		System.out.println("f1 f");
		// 기본형 datatype: byte,short,char,int,long,float,double,boolean
		// 값저장, 연산, 비교
		// Wrapper class: 기본형 datatype+기능추가

		byte v1 = 100;
		int v2;
		// 1. 자동형변환
		v2 = v1;
		// 2.강제형변환
		v1 = (byte) v2;
		// String은 기본형이 아님. java.lang.String class
		String s = "100";
		int v3;
		v3 = Integer.parseInt(s);
	}
}
