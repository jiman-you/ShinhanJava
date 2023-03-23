package com.shinhan.day06;

public class InnerCalssTest {

	public static void main(String[] args) {
		f4();

	}

	private static void f4() {
		class LocalClass{
			String s3 = "LoclasClass임";
			static String s4 = "Local static임";
			void method5() {
				System.out.println("loclaclass ..instance");
			}
			static void method6() {
				System.out.println("localclass .. static");
			}
			LocalClass lo = new LocalClass();
	}

	private static void f3() {
	OuterClass.StaticInnerClass v1;
	v1 = new OuterClass.StaticInnerClass();
	System.out.println(v1.s1);
	}

	private static void f2() {
		//2.Instance innerclass
		OuterClass.InstanceInnerClass v1;
		v1 = new OuterClass().new InstanceInnerClass();
		System.out.println("ins"+v1.s1);
		System.out.println("static"+OuterClass.InstanceInnerClass.s2);
	v1.method3();
	}

	private static void f1() {
		//1.일반적인 class사용
		OuterClass v1 = new OuterClass();
		System.out.println("instance field :"+v1.a);
		System.out.println("static field :"+OuterClass.b);
		v1.method();
		OuterClass.method2();
		
	}

}
