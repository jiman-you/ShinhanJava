package com.shinhan.day03;

public class StydentTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		Student student1 = new Student();
		Student student2 = new Student("dlacogml", "123", "c", 222);
		student1.name = "김경윤";
		student1.stdId = "12313";
		student1.subject = "java";
		student1.score = 12312;

		display(student1);
		display(student2);

	}

	private static void display(Student std) {
		System.out.println("----------");
		System.out.println(std.name);
		System.out.println(std.stdId);
		System.out.println(std.subject);
		System.out.println(std.score);
		std.Study();

	}

}
