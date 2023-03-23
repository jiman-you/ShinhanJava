package com.shinhan.ch13;

class OverridingTest {
	public static void main(String args[]) {
		int i = 10;
		int j = 20;

		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);
		String s = "30";

		System.out.println(ms1);// 30
		System.out.println(ms2.toString());// 30

		if (ms1.equals(ms2))
			System.out.println("ms1과 ms2의 합계는 동일합니다.");
		
		if(ms1.equals(s))
			System.out.println("ms1과 s의 값은 동일합니다.");
		else System.out.println("ms1과 s의 값은 동일하지않습니다.");
		
	}
}
