package com.shinhan.day11.ch16;

public class LambdaTest2 {
	static String subject = "자바";
	public static void main(String[] args) {
		new LambdaTest2().f1(100);
		
	}
	
	private static void f1(int su1) {//마라메터는 지역변수
		int su2 = 200;//지역변수
		
		//내부 클래스에서 지역변수를 사용한다면fina의 특성을 가진다,
		//1.익명구현class
		Caculable2 f2 = (a,b)->{
			System.out.println("람다ㅁ펴햔식"+subject);
			
			return a+b+su1+su2;
		};
		Caculable2 f = new Caculable2() {
			
			@Override
			public int caculate(int x, int y) {
				System.out.println("익명구현객체");
				return x+y+su1+su2;
			}
		};
		int result = f2.caculate(1, 2);
		System.out.println(result);
		
	}
}
