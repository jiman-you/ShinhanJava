package com.shinhan.ch12;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
