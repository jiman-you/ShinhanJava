package com.shinhan.day02;

import java.util.Scanner;

public class 유지만 {
	public static void main(String[] args) {
		method4_7();
	}

	private static void method3_1() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		// 31
	}

	private static void method3_2() {
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);
		// 가
	}

	private static void method3_3() {
		int pencils = 534;
		int students = 30;
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		// 남은 연필 수
		int pencilLeft = pencils % students;
		System.out.println(pencilLeft);
	}

	private static void method3_4() {
		int value = 356;
		System.out.println(value / 100 * 100);
	}

	private static void method3_5() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ();
		System.out.println(area);
		//4.(double)((lengthTop+lengthBottom)*height/2)
	}

	private static void method3_6() {
		int x = 10;
		int y = 5;
		System.out.println(((x > 7) && (y <= 5)));// TRUE
		System.out.println((x % 3 == 2) || (y % 2 != 1));// FALSE
	}

	private static void method3_7() {
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		if (Double.isNaN(z)) {
			System.out.println("0.0.으로 나눌 수 없습니다");
		} else {
			double result = z + 10;
			System.out.println("결과:" + result);
		}
	}

	private static void method4_1() {
		// 2.switch 문에서 사용할 수 있는 변수의 타입은 int,double이 될 수 있다.
	}

	private static void method4_2() {
		String grade = "B";
		int score1 = 0;
		switch (grade) {
		case "A" -> score1 = 100;
		case "B" -> {
			int result = 100 - 20;
			score1 = result;
		}
		default -> score1 = 60;
		}
	}

	private static void method4_3() {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				total += i;
		}
		System.out.println(total);// 1683
	}

	private static void method4_4() {
		while (true) {
			int A = (int) (Math.random() * 6) + 1;
			int B = (int) (Math.random() * 6) + 1;
			System.out.printf("(%d,%d)\n", A, B);
			if (A + B == 5)
				break;
		}
	}

	private static void method4_5() {// (5,8),(10,4)
		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <= 12; j++) {
				if ((4 * i) + (5 * j) == 60)
					System.out.printf("(%d,%d)\n", i, j);
			}
		}
	}

	private static void method4_6() {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void method4_7() {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.예금:2.출금:3.잔고:4.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			int num = scn.nextInt();

			switch (num) {
			case 1:
				System.out.println("선택>1");
				System.out.print("예금액>");
				int money1 = scn.nextInt();
				continue;
			case 2:
				System.out.println("선택>2");
				System.out.print("출금액>");
				int money2 = scn.nextInt();
				continue;
			case 3:
				System.out.println("선택>3");
				System.out.print("잔고>");
				int money3 = scn.nextInt();
				continue;
			case 4:
				System.out.println("선택>4");
				System.out.println();
				System.out.println("프로그램 종료");
				break;
			}
			break;
		}
	}
}