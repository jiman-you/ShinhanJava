package com.shinhan.day01;

public class vatiableTest2 {

	public static void main(String[] args) {
		f3();//함수호출
		
		
	}
	private static void f1() {
		int a;
		System.out.println(a=10);//10을 a에 할당
		System.out.println(a==10);//a와 10이 같으냐
	}

	private static void f2() {
		//자바의 datatype :
		//정수(byte-1,short-2, char-2, int-4, long-8),
		//실수(float-4, double-8)
		//논리 (boolean-1):true false
		
		byte v1 =127;
		byte v2 =-128;
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(Integer.toBinaryString(v2));
		
	}

	private static void f3() {
		short v1 = 32767;
		char v2 = 'A';//한글자 char은 ''만 사용, ""불가
		int v3 = 2147483647;//Integrt.MAX_VALUE
		long v4 = 2147483648L;//int보다 큰 수long 타입은L을 붙여줘야함
		float v5 =3.14f;//float은 f를 붙여줘야함
		double v6= 3.14;
		
		char v7=65;
		char v8= 0x0041;
		System.out.println(++v7);
		System.out.println(v8);
		
		boolean result = 10>20;
		System.out.println(result);
	}

	
	

}
