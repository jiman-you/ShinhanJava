package com.shinhan.day03;
//int numberOfPersons;	// 전체 인구 수

////Person 객체가 생성될 때마다 증가
//int age;	
//String name;	
//Person()	// 나이는 12살, 이름은 “Anonymous”로 초기화함
//
//Person(int age, String name)	// 나이는 age 매개변수, 이름은 name 매개변수로 Setting함
//selfIntroduce()	// “내 이름은 …. 이며, 나이는 … 살 입니다.”를 출력함
////예) 내 이름은 철수이며, 나이는 3살입니다.
//
//getPopulation()	// 전체 인구수를 Return함

public class Person {
	static int numperOfPersonns;
	int age;
	String name;

	Person() {
		this(12, "Anonymous");// 첫번째 줄에서만 사용가능
//		age = 3;
//		name = "nam";
//		numperOfPersonns++;

	}

	Person(int age, String name) {
		numperOfPersonns++;
		this.age = age;
		this.name = name;
	}

	void selfIntroduce() {
		System.out.println("내 이름은 " + name + "이며, 나이는" + age + "상 입니다");

	}

	static int getPopulation() {
		return numperOfPersonns;
	}
	public static void main(String[] args) {
		System.out.println(Person.getPopulation());
		
		Person[] persons = new Person[100];
		
		
		persons[0] = new Person();
		persons[0].selfIntroduce();
		System.out.println(Person.getPopulation());
		
		persons[1] = new Person(30,"nami");
		persons[1].selfIntroduce();
		System.out.println(Person.getPopulation());
		
		for(Person p:persons) {
			p.selfIntroduce();
		}
		
	}
}
