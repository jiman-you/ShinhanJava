package com.shinhan.day05_2;

public sealed class Animal permits Cat,Dog{
	int a = 10;
	
	void method1() {
		System.out.println("Animal method1");
	}
}
