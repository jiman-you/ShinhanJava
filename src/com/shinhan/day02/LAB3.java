package com.shinhan.day02;

import java.util.Scanner;

public class LAB3 {
	//public : 모든 패키지에서 접근가능
	//static : >java LAB3실행하면 하기전에 LAB3의 bynarycode가 메소드 영역에 올려간다,.
	//void : reture 
	public static void main(String[] args) {
		lab5();

	}

	private static void lab5() {
		
		for(int i = 1;i<=15;i++) {
			for(int j = 1;j<=12;j++) {
				if((4*i)+(5*j)== 60)
					System.out.printf("(%d,%d)\n",i,j);
			}
		}
		
	}

	private static void lab4() {
		int A=0,B=0,total=0;
		
		while(total== 5) {
			A = (int) (Math.random()*10);
			System.out.println(A);
			B = (int) (Math.random()*10);
			System.out.println(B);
			total = A+B;
		}
		
	}

	private static void lab3() {
		int total = 0;
		for(int i =1;i<=100;i++) {
			if(i%3 == 0)
				total+=i;
		}
		System.out.println(total);
	}

	private static void lab2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 숫자를 입력해주세요");
		int A = sc.nextInt();
		int B = sc.nextInt();
		abs(A,B);
		
	}

	private static void abs(int A,int B) {
		// TODO Auto-generated method stub
		int result = A-B;//(A-B>0?A-B:B-A);
		if(result<0)
			result*=-1;
		System.out.println(result);
	}

	private static void lab1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요");
		int month = sc.nextInt();

		printSeason(month);
	}

	private static void printSeason(int mon) {
		switch(mon) {
		case 3,4,5:
			System.out.println("봄");
			break;
		case 6,7,8:
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		case 12,1,2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("1~12중 입력해주세요");
			break;
		}
	}

}
