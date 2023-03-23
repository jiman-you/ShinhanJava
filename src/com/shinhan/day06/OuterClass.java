package com.shinhan.day06;

public class OuterClass {
	// 1.field(instance field, static field)
	int a = 10;
	static int b = 20;

	// 2.생성자 ..default 제공
	// 3.메서드
	void method() {
		System.out.println("OuterClass .. . instance method");
	}

	static void method2() {
		System.out.println("OuterClass...static method");
	}

	// 4.block(instance block {}, static block{})
	// 5.inner class: 3가지 -instance, class , local
	
	int score = 100;
	class InstanceInnerClass {
		int score = 200;//멤버변수
		String s1 = "InstanceInnerClass^^";
		static String s2 ="IntanceInnerClass@ @";

		void method3() {
			int score = 300;//지역변수
			System.out.println("InnerClass .. . instance method");
			System.out.println("score="+score);//300
			System.out.println("score="+this.score);//200
			System.out.println("score="+OuterClass.this.score);//100
		}

		static void method4() {
			System.out.println("InnerClass...static method");
			System.out.println("외부instance 필드");
		}
	}
	static class StaticInnerClass {
		String s1 = "StaticInnerClass^^";
		static String s2 ="StaticInnerClass@ @";

		void method3() {
			System.out.println("StaticInnerClass .. . instance method");
		}

		static void method4() {
			System.out.println("StaticInnerClass...static method");
		}
	}
	void f1() {
		//---static에서 non-static 호출불가
		//함수 내에있는 class, static불가
		class LocalClass{
			String s3 = "LocalClass^^";
			static String s4 ="LocalClass@ @";

			void method5() {
				System.out.println("LocalClass.. . instance method");
				System.out.println(a);
				System.out.println(b);
			}

			static void method6() {
				System.out.println("LocalClass...static method");
				//System.out.println(a);
				System.out.println(b);
			}
		}
	}
}
