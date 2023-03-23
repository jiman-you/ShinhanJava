package com.shinhan.day08;

import java.util.ArrayList;

import com.shinhan.day7.ProductVO;

public class GenericTest {
	public static void main(String[] args) {
		wildcardTest3();
	}
	private static void wildcardTest3() {//?는 모두
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}
	private static void wildcardTest2() {//? extendes 본인 - 자식
		Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}

	private static void wildcardTest() {//?는 모두
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}

	private static void method3() {
		genelicExtendechod(new ChildA());
		genelicExtendechod(new ChildB());
//		genelicExtendechod(new ChildA());
		
		method4(new HappyBox<>("사과",0));
		method5(new HappyBox<>(500, 0));
		method6(new HappyBox<>(new ChildB, 0));
		
	}//제네릭타입 제한(extend, super, ?)
	private static void method6(HappyBox<? super Parent>param) {
		System.out.println("? super Number: 넘버 자신과 상위만 가능");
		
	}

	private static void method5(HappyBox<? extends Number>param) {
		System.out.println("? extends Number: 넘버 자식만 가능");
		
	}

	//? 
	private static void method4(HappyBox<? >param) {
		System.out.println("?는 제한이 없다");
	}
	//상속
	private static <T extends Parent> void genelicExtendechod(T Param) {
		System.out.println("generic Exten~");
		
	}

	private static void method2() {
		Integer a =10;
		Integer b = 20;
		boolean result = compare(a,b);
		System.out.println(result);
		
		String s1 =new String("자바");
		String s2 =new String("자바");
		//result = compare(s1,s2);..제한에 안맞음
		System.out.println(result);
	}//타입에 제한걸기: extends Number은 넘버를 상속받은 하위 클래스만 가능하다는 의미///
	public static <T extends Number> boolean compare(T a, T b) {
		return a.equals(b);
	}
	private static <T>HappyBox<T> Boxing(T kind) {
	
		return new HappyBox<T>(kind, 1000);
	}
	private static <T,A,B>int Boxing(T kind, A a, B b,String s) {
		HappyBox<String> box1 = Boxing("과일박스");
		HappyBox<Integer> box2 = Boxing(222);
		HappyBox<Money> box3 = Boxing(new Money(200));
		
		System.out.println(box1);
		System.out.println(box1);
		System.out.println(box1);
		System.out.println(box1);
	}


	private static void f5() {
		Priduct<String, Integer> p1 =new Priduct<>("책",100);
		Priduct<String, Integer> p2 = new Priduct<>("축구", 1000);
		
		
	}

	private static void f4() {
		ArrayList<Money> data = new ArrayList<>(); //뒤에꺼는 생략가능
//		data.add(new Money(20));
//		data.add("목");
//		data.add("토");
//		data.add("일");
//		data.add("일");
//		for( Money s :data) {
//			System.out.println(s);
//		}
	}

	private static void f3() {
		ArrayList<String> data = new ArrayList<>(); //뒤에꺼는 생략가능
		data.add("월");
		data.add("목");
		data.add("토");
		data.add("일");
		data.add("일");
		for( String s :data) {
			System.out.println(s);
		}
		
	}

	private static void f2() {
		HappyBox<String> b1 = new HappyBox<String>("바나나", 100);
		HappyBox<Money> b2 = new HappyBox<Money>(new Money(2), 100);
		HappyBox<Integer> b3 = new HappyBox<Integer>(40, 100);
		
		String s1 = b1.kind;
		Money s2 = b2.kind;
		int s3 = b3.kind;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	private static void f1() {
		Box b1 = new Box("바나나", 500);
		Box b2 = new Box(900, 500);
		Box b3 = new Box(new Money(300),1000);
		
		String s1 = (String)b1.kind;
		int s2 = (Integer)b2.kind;
		Money m =(Money)b3.kind;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(m);
	}
}
