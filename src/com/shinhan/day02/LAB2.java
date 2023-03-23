package com.shinhan.day02;

import java.util.Scanner;

public class LAB2 {
	public static void main(String[] args) {
		lab6();
	}

	private static void lab8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("[입력값]");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int n = 0;
		
		int min = A>B?B:A;
		for(int gong = min;gong>=1;gong--)
		{
			if(A%gong == 0 && B%gong == 0) {
				n = gong;
				break;
			}
		}
		for(int i=1;i<=A;i++) {
			for(int k = 1;k<=B;k++) {
			if(A%i == 0 && B%k == 0 && i == k)
				n = i;
				}
			}
		System.out.println(n);
		}
	

	private static void lab7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월를 입력하세요");
		int month = sc.nextInt();
		numDay(month);
		
		public static  void numDay(int mon){
			//구현하세요.
			switch(mon) {
			case 1,3,5,7,9,11:
				System.out.printf("numDays(%d)=>31",mon);
				break;
			case 4,6,8,10,12:
				System.out.printf("numDays(%d)=>30",mon);
				break;
			case 2:
				System.out.printf("numDays(%d)=>28",mon);
				break;
			default:
				System.out.printf("%d월은 존재하지않습니다.",mon);
				break;
		}
	}
	}

	private static void lab6() {
//		문제6 . 주어진 년도의 월에 해당하는 말일을 계산하는 프로그램을 완성하시오.
//		윤년인 경우에는 다음과 같은 조건에 의해 처리합니다.
//		1)	4의 배수인 해는 윤년.
//		2)	4의 배수이면서 100의 배수인 해는 윤년이 아님.
//		3)	100의 배수이면서 400의 배수인 해는 윤년.
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요");
		int month = sc.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 9, 11:
			System.out.printf("%d년 %d월은 31일까지 있습니다.", year, month);
			break;
		case 4, 6, 8, 10, 12:
			System.out.printf("%d년 %d월은 30일까지 있습니다.", year, month);
			break;
		case 2:
			if (year % 400 == 0) {
				System.out.printf("%d년 %d월은 29일까지 있습니다.", year, month);
				break;
			} else if (year % 100 == 0) {
				System.out.printf("%d년 %d월은 28일까지 있습니다.", year, month);
				break;
			} else if (year % 4 == 0) {
				System.out.printf("%d년 %d월은 29일까지 있습니다.", year, month);
				break;
			} else {
				System.out.printf("%d년 %d월은 28일까지 있습니다.", year, month);
				break;
			}
		}
		
	}

	private static void lab5() {
//		1부터 시작해서 두 항의 차이가 1씩 증가
		int count = 1, total = 0;
		for (int i = 1; i <= 15; i++) {
			total += count;
			count += i;
		}
		System.out.println("15쨰까지의 합" + total);
	}

	private static void lab4() {
//		문제4. 임의의 정수를입력 받아서,
//		1부터 1,000까지의 수 중에서 입력 받은 정수의 배수의 개수와 배수들의 합을 계산하십시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~1000수를 입력하세요:");
		int num = sc.nextInt();
		int count = 0, total = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % num == 0) {
				count++;
				total += i;
			}
		}
		System.out.println(num + "의 배수개수" + count);
		System.out.println(num + "의 배수의합" + total);
		sc.close();
	}

	private static void lab3() {
//		문제3. 임의의 숫자를 입력 받아 아래와 같은 실행 결과가 나타나는 프로그램을 작성하십시오. 
//		정수 n의 팩토리얼(factorial)은 1부터 n까지의 모든 정수를 곱한 것으로 n!로 표시합니다.
//		단 2보다 작거나 9보다 큰 정수가 입력될 경우에는 “잘못된 숫자가 입력되었습니다.”라는 경고 메시지를 출력하고
		// 프로그램을 종료합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9수를 입력하세요:");
		int num = sc.nextInt();
		int k = 1;

		if (1 < num || num > 10) {
			for (int i = 1; i <= num; i++) {
				k *= i;
			}
		} else
			System.out.println("잘못된 숫자가 입력되었습니다.");
		System.out.printf("%d! = %d", num, k);

	}

	private static void lab2() {
//		소수란 자신과 1외의 다른 수로는 나누어 떨어지지 않는 정수입니다. 
//		아래와 같이 2~100 사이의 숫자를 입력하면 소수인지 여부를 판별하는 프로그램을 작성하십시오.

		Scanner sc = new Scanner(System.in);
		System.out.print("2~100수를 입력하세요:");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("소수입니다");
		} else {
			System.out.println("소수가 아닙니다");
		}
	}

	private static void lab1() {
		// 입력받은 숫자 구구단출력
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9수를 입력하세요:");
		int num = sc.nextInt();
		int count = 0;

		if (1 < num || num > 10) {
			for (int i = 1; i <= 10; i++) {
				count = num * i;
				System.out.println(num + "*" + i + "=" + count);
			}
		} else
			System.out.println("오류입니다");

	}
}
