package com.shinhan.day03;

//class = 변수+메서드
public class Student {
	// 1.field-변수,속성,특징
	String name;
	String stdId;
	String subject;
	int score;

	// 2.Counstructor(생성자)메서드...컴파일시에 자동으로default생성자 제공.
	// 정의가능
	// 생성자가 정의되면 default 생성자가 만들어지지 않음.
	// 생성자의 OverLoading: 이름은 같고 매개변수 사양이 다름.
	Student() {
		System.out.println("디폴트");
	}

	Student(String name, String stdId, String subject, int score) {
		System.out.println("아규먼트");
		// 멤버변수(field)와 매개변수(argument)가 충돌
		// 구별필요 이 클래스로 만든 현재객체 this라고 한다
		this.name = name;
		this.stdId = stdId;
		this.subject = subject;
		this.score = score;
	}

	// 3.일반메서드(행위)
	void Study() {
		System.out.println(name + "학생이 공부합니다.");
	}
	
	// 4.block(instance-생성시마다 시행, static-load시 1회시행)
	{
		System.out.println("2ins");
	}
	static {
		System.out.println("1sta");
	}

	// 5.inner class
	class Phone {

	}
}
