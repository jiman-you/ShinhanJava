package com.shinhan.day02;

public class 반복문 {

	public static void main(String[] args) {
		forTest4();

	}

	private static void forTest4() {
		// 1~10합계
		int su = 1;
		int total = 0;
		
		for(;su<=10;++su) {
			if(su%2==0) continue;//반복문에서 무시하고 계속진행
			total= total + su;
			System.out.print(su+"+");
			System.out.print(su == 10 ? "":"+");
			
		}
		System.out.println("="+total);
	}


	private static void whileTest2() {
		int i = 1;
		while(true) {
			if(i>10) break;
			System.out.println(i);
			i++;
		}
	}

	private static void forTest2() {
		// 1~10 출력
		int i = 1;
		for (i = 1; i <= 10; i++) {
			if (i > 10)
				;
			System.out.println(i);
			System.out.println("mmm");
		}
	}

	private static void forTest() {
		// 1~10 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			System.out.println("mmm");
		}

	}

}
