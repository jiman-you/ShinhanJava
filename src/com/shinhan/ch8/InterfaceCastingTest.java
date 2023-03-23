package com.shinhan.ch8;
//			a		인터페이스
//		b		c	구현클래스
//		d		e	자식클래스
interface A {
	void method1();
}

class B implements A {
	public void method1() {
		System.out.println("B메서드 재정의");
	}
}
	class C implements A {
		public void method1() {
			System.out.println("c메서드 재정의");
		}
	}


class D extends B {
	public void method1() {
		System.out.println("D메서드 재정의");
	}
	public void method2() {
		System.out.println("D매서드 추가");
	}
}


class E extends C {
	public void method1() {
		System.out.println("e메서드 재정의");
	}
}


public class InterfaceCastingTest {
	public static void main(String[] args) {
		A v1 = new D();
		B v2 = new D();
		D v3 = new D();
	
		v1.method1();
		((D)v1).method2();
		((D)v2).method2();
		v3.method2();
		
		//강제타입변환은 자동타입변환 된 것을 되돌리는것
//		E e = (E)v1;
//		e.method1();
	}
}
