package com.shinhan.day07;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class ObjectTest4 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		SimpleDateFormatTest();
	}

	private static void SimpleDateFormatTest() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		String result = sdf.format(d);
		System.out.println(result);
		System.out.println(d);
	}

	private static void DecimalFormatTest() {
		DecimalFormat df = new DecimalFormat("000,000,000");//빈 칸을 0으로 채운다
		DecimalFormat df2 = new DecimalFormat("###,###,###");//빈 칸을 비운다.
		long money =100000L;
		String result = df.format(money);
		System.out.println(result);
	}

	private static void DateTest() {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONDAY)+1);//0월부터 있어서 +1해줘야함
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue());
		System.out.println(dt.getDayOfWeek());//알파벳으로 알려줌
		System.out.println(dt.getDayOfMonth());//날짜로 알려줌
		
		
	}

	private static void MathTest() {
//		Math.max(10, 20);
		int a=10,b=20;
		int max;
		//1.
		if(a>b) max=a; else max=b;
		//2.
		max = Math.max(a, b);
		
		//round(반올림), ceil(올림),floor(무조건버림)
		double c = 3.1;
		System.out.println(Math.ceil(c));
		
	}

	private static void BoxTest5() {
		Integer a = 10;
		Integer b = 20;
		System.out.println(a==b);
		System.out.println(a.intValue()==b.intValue());
		
	}

	private static void BoxTest4() {
		String s = "이것이자바다 12345 This is 678 Java ";
		char[] arr = s.toCharArray();
		StringBuilder result=new StringBuilder();
		for(char ch:arr) {
			if(Character.isDigit(ch)) {
			result.append(ch);	
			}
		}
		System.out.println(result);
	}

	private static void BoxTest3() {
		String s ="이것이자바다 This is Java";
//		System.out.println(s.substring(0,3));
//		System.out.println(s.charAt(0));
		char[] arr = s.toCharArray();
		for(char ch:arr) {
			if(Character.isUpperCase(ch)) {
				System.out.println(ch+"---대문자");
			}else {
				System.out.println(ch+"---대문자 아님");
			}
		}
		
	}

	private static void BoxTest2() {
		String score = "100";
		int score2 = Integer.parseInt(score);
		System.out.println(score2+200);
		
		int su = 10;
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.bitCount(su));
	}

	private static void BoxTest() {
		int a = 10;// 기본형(값 저장, 연산, 비교)
		Integer b = 20;// 참조형(객체: 기본형+기능) 자동으로 박싱이 됨 AutoBoxing: new Integer(20)
		System.out.println(a + b.intValue() + 200);// Unboxing;b.intvalue() 자동으로 해줌
		float f = b.floatValue();
		System.out.println(Integer.MAX_VALUE);
		int su = Integer.compare(10, 5);// 차가 양 1 0=0 음 -1
		System.out.println(su);

		int[] arr = { 10, 90, 20, 30, 40 };
		Arrays.sort(arr);// 작은순
		System.out.println(Arrays.toString(arr));

	}

	private static void StringTokenizerTest2() {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.toString());

		String s = dt.toString();
		String[] arr = s.split("T");
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		StringTokenizer st = new StringTokenizer(s, "T-:");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

	private static void StringTokenizerTest() {
		String fruits = "사과,오렌지/키위 수박,참외";
		String[] arr = fruits.split(",|/| ");
		for (String f : arr) {
			System.out.println(f);
		}
		StringTokenizer st = new StringTokenizer(fruits, ",/ ");
		while (st.hasMoreTokens()) {
			System.out.println();
		}

	}

	private static void StringBuilderTest() {
		String s1 = "자바";// 가장 일반적 STring은 고정문자열
		System.out.println(s1 + "프로그램");
		s1 = s1 + "프로그램"; // 메모리낭비

		StringBuilder sb = new StringBuilder("자바StringBuilder");
		StringBuffer sb2 = new StringBuffer("자바StrinbBuffer");

		sb.append("프로그램");
		System.out.println(sb);
		sb2.insert(3, "프로그램");
		System.out.println(sb2);

		String s2 = new String(sb);// 스트링빌더,버퍼를 스트링으로 변경
		String s3 = new String(sb2);// 스트링빌더,버퍼를 스트링으로 변경

	}

	private static void StringTest() throws UnsupportedEncodingException {
		String s1 = "자바";// 가장 일반적
		String s2 = new String("자바");
		byte[] arr1 = new byte[] { 65, 66, 67, 97, 98, 99 };
		char[] arr2 = new char[] { 'A', 'B', 'C', 'a', 'b', 'c' };
		String s3 = new String(arr1);
		String s4 = new String(arr2);
		System.out.println(s1 + s2 + s3 + s4);

		byte[] arr3 = s1.getBytes("urf-8");
		byte[] arr4 = s1.getBytes("euc-kr");

		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr3.length);
		System.out.println(arr4.length);

	}
}
