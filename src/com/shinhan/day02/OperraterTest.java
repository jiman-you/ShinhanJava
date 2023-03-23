package com.shinhan.day02;

public class OperraterTest {

	public static void main(String[] args) {

		method7();

	}
	private static void method7() {
		
		int a=10;
		if(a>70) {
			System.out.println("합격");
		}else {
			System.out.println("불하벽");
		}
	}
	private static void method6() {
		
		int a =10;
		a++;
		++a;
		a = a + 1;
		a+=10;

		
	}
	private static void method5() {
		int a = 10;
		int b = 20;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a==b);
	}
	private static void method4() {

		int a = 10;
		int b = 20;
		// &&(단축) : 앞의 결과가 거짓이면 뒷부분 실행안함
		// & : 끝까지 실행한다
		boolean result1 = a > 10 || b++ == 20;
		boolean result2 = a > 10  |b++ == 20;
		System.out.println(result1);
		System.out.println("b=" + b);

	}
	private static void method3() {

		int a = 10;
		int b = 20;
		// &&(단축) : 앞의 결과가 거짓이면 뒷부분 실행안함
		// & : 끝까지 실행한다
		boolean result1 = a >= 10 && b++ == 20;
		boolean result2 = a >= 10 && b++ == 20;
		System.out.println(result1);
		System.out.println("b=" + b);

	}

	private static void method2() {

		int a = 10;
		int b = 0;// 정수는 0으로 나눌수없다
		// RuntimeExceti- 컴파일 시에는 오류없으나 실행시에 오류

		double d = 0.0;
		System.out.println(Double.isInfinite(a / d));
		System.out.println(a / d);
		System.out.println(a % d);

		if (Double.isNaN(a % d++))
			if (Double.isInfinite(a / d)) {
				System.out.println("계산불가");
			} else {
				System.out.println(a / d);
			}
	}

	private static void method1() {

		int a = 10;
		int b = 5;
		++a;// 증가 후 사용
		a++;// 사용 후 증가
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);

		System.out.println("더하기" + (a + b));
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println("몫" + a / b);
		System.out.println("나머지" + a % b);

	}

}
