package com.shinhan.day05;

 class parent {
	int a = 10;
	parent(){
		System.out.println("부모생성");
	}
	void f1() {
		System.out.println("자식f2");
	}
}
 
 class child extends parent {
	int b = 20;
	child(){
		System.out.println("자식생성");
	}
	void f2() {
		System.out.println("자식f2");
	}
}

public class InheritenceTest {

	public static void main(String[] args) {
		child ch = new child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		ch.f1();
		ch.f2();
	}

}

