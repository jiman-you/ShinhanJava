package com.shinhan.day02;

import java.io.IOException;
//java.lang패키지에 있는 class는 import없이 사용
import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		f2();
	}

	private static void f2() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();//숫자읽기
		String name = sc.next();//단어읽기
		String meno =sc.nextLine();//줄읽기
		
		System.out.println(name+"==>"+score);
	}

	private static void f1() throws IOException {
		// 사용자 입력받기
		System.out.println("정수입력>>");
		InputStream is = System.in;

		int i;
		while ((i = is.read()) != 13) {
			System.out.println((char) i);
		}

	}

}
