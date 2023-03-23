package com.shinhan.day01;

public class StringTest {

	public static void main(String[] args) {
		f8();
	
	}


	private static void f8() {
		
		int a = 10;
		int b = 20;
		System.out.println("a="+a+",b+"+b);
		 System.out.println("-----");
		System.out.printf("!a= %d,!!b= %d",a,b);
		//%6d = 오른쪽정렬 ___123, %-6d= 왼쪽정렬 123___
	}

	private static void f7() {
		
		int a = 100;
		{
			int b = 200;
			System.out.println(a+b);
		}
		//System.out.println(a+b);// 블록 안에서 선언된 변수는 밖으로 빠져나올 수 없음
	}
	private static void f6() {
		//자바기본타입 : byte, short, int, long, float, double, boolean
		//Wrapper Class : 자바기본타입 + 기능(함수)
		//Byte, Short, Character, Integer ,Long, Float, Double, Boolean
		
		String score = "90";
		int i =100;
		Integer i2 =100;
		System.out.println(Integer.parseInt(score)+10);//문자 + 숫자 = 문자
		
		
	}

	private static void f5() {
		//사칙연산에서 byte, short는 자동으로 int로 변환
		byte v1 = 10;
		byte v2 = 20;
		byte v3 = (byte) (v1+v2);
		int v4 = v1+v2;

		
	}

	private static void f4() {
		//*강제 형변환*
		//작은방 = (작은방 타입)큰 값
		//데이터 손실 가능성
		byte v1;
		int v2 = -120;
		v1 =(byte)v2;
		
		System.out.println(v1);
		
		
	}

	private static void f3() {
		// *자동 형변환*
		//큰방 = 작은 값
		//byte < short < int < long < float < double
		byte v1 = 127;
		short v2 = v1;
		int v3 = v1;
		System.out.println(v3);
		
		
	}

	private static void f1() {
		//java.base 모듈 -java.lang.String class
		//기본형이 아님
		//String : 고정문자열
		String s1 = "자바";//컴파일 시점에 .class의 힙영역의 상수pool에 만들어짐
		String s2 = "자바";//컴파일 시점에 이미 힙역역만들어져있어 그대로 사용 = 주소값 같음
		String s3 = new String ("자바");//실행시에 만들어진다 
		String s4 = new String ("자바");//주소값 다름
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 == s2);
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		s1 = s1+"프로그램";
		s2 = s2+"프로그램";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 == s2);
	}
	
	
	private static void f2() {
		String str1 = "자바 프로그램 완성";
		String str2 = "자바 \"프로그램\" 완성";
		String str3 = "{\"name\":\"홍\",\"age\":\"20\"}";//json 자바스크립트 형태의 문자열 - 데이터 교환용
		String str4 = """
				{"name":"홍","age":"20"}
				""";//"""java17버전 이상은 """을 사용하여 역슬래쉬 사용 안해도됨
		System.out.println(str3);
		System.out.println(str4);
		
	}
}
