package com.shinhan.day02;

import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		lab4();
	}

	public static void lab4() {
//		문제5. 입력 받은 수 만큼 ‘*’로 직각 역삼각형을 출력하는 프로그램을 작성하십시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수를 입력하세요:");
		int count = sc.nextInt();
		int ccount= count;
		for(int i =1;i<=count;i++) {
			for(int j=1;j<=ccount;j++) {
				System.out.print("*");
		}
		System.out.println();
		ccount--;
	}
	}
	private static void lab3() {
//		a. 입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
//		- 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
//		b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
//		- 예제 : 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int score = sc.nextInt();
		int total = 0;
		int k =score%2;
		switch (k) {
		case 0: 
			for(int i=0;i<=score;i+=2) {
				total+=i;
				System.out.println(i);
			}
			break;
		case 1:
			for(int i=1;i<=score;i+=2) {
				total+=i;
			}
			break;
		
		}
		System.out.println(total);
		sc.close();
		
	}

	private static void lab2() {
//		문제2.  문자열을  입력 받아서 아래와 같은 실행결과가 나타나도록  ForTest클래스의  main
//		메쏘드를 완성하십시오. 입력 받은 문자열을 한 글자씩 증가시키며 출력하는 프로그램입니다.대문자
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String str = sc.nextLine();
		str = str.toUpperCase();
		
		for(int i =0; i<=str.length();i++) {
			System.out.println(str.substring(0,i));
			
		}
//		System.out.println(str.length());//길이반환
//		System.out.println(str.substring(0,2));//<= <ㅁㅇ
//		System.out.println(str.toUpperCase());//대문자
	}

	private static void lab1() {
//		 문제1.  초기 값,  마지막 값,  증가분을 입력 받아서,  초기값부터 마지막 값까지,  증가분씩 값을
//		증가시키면서 각 값들의 총합을 구하는 프로그램을 작성하세요.  단,  합을 구한 결과가 1000을
//		넘으면, 결과에 2000을 한번 더 더하여 출력합니다.
		int start, end, increment, total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요. :");
		start = sc.nextInt();
		System.out.print("마지막 값을 정수로 입력하세요. :");
		end = sc.nextInt();
		System.out.print("증가분을 정수로 입력하세요. :");
		increment = sc.nextInt();
		for (int i = start; i <= end; i += increment) {
			total += i;
		}
		System.out.printf("총합은 %d 입니다.", total);
		sc.close();
	}
}
