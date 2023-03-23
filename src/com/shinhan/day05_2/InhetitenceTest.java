package com.shinhan.day05_2;

//Child ch = new Child: obdect - Parent -Child
//ca.a

//final class : 상속불가
//final method: 재정의 불가 = 오버라이딩 불가
//final field: 값수정 불가
class Parent{
	final int a = 10;
	Parent(){
		System.out.println("부모의 생성자");
	}
	void method1() {
		System.out.println("부모의 메서드:");
	}
}
class Child extends Parent{
	//String a ="자바";//덮어쓰기
	int b = 20;
	Child(){
		System.out.println("자식의 생성자");
	}
	void method1() {
		System.out.println("자식의 메서드:");
	}
//	void method1(String b) {
//		System.out.println("자식의 method:");
//	}
	
	void method2() {
		System.out.println("자식의 메서드2:");
	}
	
}

public class InhetitenceTest {

	public static void main(String[] args) {
		f4();

	}

	

	private static void f3() {
		CarTest car = new CarTest();
		hankukTire a = new hankukTire();
		car.go(new KumhoTire());
		car.go(a);
		
	}

	private static void f2() {
		Parent p = new Child();//타입이 부모일때 자식이 숨겨놓은걸 볼 수 없음.
		p.method1();// 재정의를 한 메서드는 자식꺼가 실행
		
	}

	private static void f1() {
		Student st1 = new Student("123", "홍길동");
		Student st2 = new Student("124", "박긱독","컴공");
		Student st3 = new Student("125","최강뚝","간호",10);
		ExchangeStudent st4 = new ExchangeStudent("126", "은빈", new String[] {"영어","프랑스"});
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(Student.count);
	}
	private static void f4() {
		//자동 형변환 : 부모타입 = 자식객체
		D v1=new D();
		B v2=new D();
		A v3=new D();
		System.out.println(v1.max);
		System.out.println(v2.max);
	//	System.out.println(v3.max);
		
		//강제형변환 : 자식타입 = 부모타입객체
		D v4 = (D)v3;
		System.out.println(v4.max);
		
		//E v5 = (E)v2;//컴파일시에 오류없음 ..실행시 캐스트오류
		//본래 생성된 instance로만 형변환이 가능
		
		//형변환 가능한지 체크하자
		System.out.println(v3 instanceof D);
		System.out.println(v3 instanceof E);
		System.out.println(v3 instanceof A);
		if(v3 instanceof D) {
			D dd = (D)v3;
			System.out.println(dd.max);
		}
		if(v3 instanceof D dd) {
			System.out.println(dd.max);
		}
	}
}

class A{}
class B extends A{int max = 100;}    				 			class C extends A{}
class D extends B{}  class E extends B{}  		class F extends C{}
