package com.shinhan.day05_2;

public class AnimalTest {

	public static void main(String[] args) {
		f3();

	}
	
	private static void call(Animal ani) {
		ani.method1();
		if(ani instanceof Dog) {
		Dog dog2 = (Dog)ani;
		System.out.println(dog2.a+dog2.c);
		}else if(ani instanceof Cat) {
			Cat cat2 = (Cat) ani;
			
		}
	}
	
	private static void f3() {
		//공통되는 모듈을 사용해야 할 때 부모타입을 이용
		Cat cat = new Cat();
		Dog dog = new Dog();
		call(cat);
		call(dog);
		
		
	}
	private static void f2() {
		//field,method는 instance가 아닌 타입을 따른다.
		Animal c1 = new Cat();
		System.out.println(c1.a);
		//System.out.println(c1.b);
		c1.method1();
		//c1.method2(); 
		
	}
	private static void f1() {
		Cat c1 = new Cat();
		System.out.println(c1.a);
		c1.method1();
		
	}

}
