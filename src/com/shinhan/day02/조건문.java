package com.shinhan.day02;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {

		method4();

	}

	private static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 >>");
		int month = sc.nextInt();
		String memo = " ";
		
		switch(month) {
		case 12:
		case 1:
		case 2: memo = "겨울"; break;
		case 3:
		case 4:
		case 5: memo = "봄"; break;
		
		default: break;
		}
		
	}

	private static void method3() {
		// 12 1 2 겨울
		// 3 4 5 봄
		// 6 7 8 여름
		// 9 10 11 가을

		Scanner sc = new Scanner(System.in);
		System.out.print("월 >>");
		int month = sc.nextInt();
		String memo = " ";

		if (month == 12 || month == 1 || month == 2) {
			memo = "winter";
		} else if (month == 3 || month == 4 || month == 5) {
			memo = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			memo = "여름";
		} // ....
		System.out.println(memo);
	}

	private static void method2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수>>");
		int score = sc.nextInt();
		String grade = "F";

		switch (score / 10) {
		case 10:
			grade = "A";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;

		default:
			grade = "F";
			break;
		}
		System.out.println("결과는" + score + "==>" + grade);

	}

	private static void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수>>");
		int score = sc.nextInt();
		String grade = "F";

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "c";
		}
		System.out.println("결과는" + score + "==>" + grade);

	}

}
