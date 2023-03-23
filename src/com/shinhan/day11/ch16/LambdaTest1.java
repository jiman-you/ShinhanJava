package com.shinhan.day11.ch16;

import com.shinhan.day04.Caculator;

public class LambdaTest1 {
	public static void main(String[] args) {
		f5();
	}

	private static void f5() {//리턴이 있는 람다.
		Caculable2 f = (a,b)->a+b;
		Caculable2 f2 = new Caculable2() {
			@Override
			public int caculate(int x, int y) {
				
				return x+y;
			}
		};
		Caculable2 f3 = (a,b)->{
			System.out.println("여러문장이라면 블록필요");
			System.out.println("반드시 리턴문 작성");
			return a+b;
		};
		
		int result1 = f.caculate(1, 2);
		int result2 = f2.caculate(1, 2);
		int result3 = f3.caculate(1, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	private static void f4() {
		Person p1 = new Person();
		p1.Action1(new Workable() {

			@Override
			public void work(String name, String job) {
				System.out.println("내이름은" + name);
				System.out.println("직업은" + job);
				System.out.println("========");
			}
		});
		p1.Action1((a, b) -> System.out.println(a + "==" + b));
		p1.Action1((a, b) -> {
		
			System.out.println(a + "^^^" + b);
			System.out.println(a + "%%%" + b);
		});
		Workable f=(a,b)->{
			System.out.println(a + "^^^" + b);
			System.out.println(a + "%%%" + b);
		};
		p1.Action1(f);
		
//		p1.Action2(s->System.out.println(s+"말하기"));
		Speakable f2 = s->s+"!!!!!";
		p1.Action2(f2);
	}

	private static void work(Runnable r) {
		Thread t1 = new Thread();
		t1.start();

	}

	private static void f3() {
		work(() -> {
			System.out.println("A1");
		});
		work(() -> {
			System.out.println("B2");
		});
		work(() -> {
			System.out.println("C3");
		});
//				new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
	}

	private static void action(Caculable func) {
		func.caculate(10, 20);
	}

	private static void f2() {
		// 1.구현 class이용 x
		// 2. 익명 class이용
//		(new Calculable() {
//			@Override
//			public void caculate(int x, int y) {
//				System.out.println("====익명class이용====");
//				System.out.println("더하기:"+(x+y));		
//			}
//		}).caculate(10,20);
		Caculable f = new Caculable() {
			@Override
			public void caculate(int x, int y) {
				System.out.println("====익명class이용====");
				System.out.println("더하기:" + (x + y));
			}
		};
		Caculable f2 = new Caculable() {
			@Override
			public void caculate(int x, int y) {
				System.out.println("====익명class이용====");
				System.out.println("빼기:" + (x - y));
			}
		};
		Caculable f3 = (a, b) -> {
			System.out.println("====익명class이용====");
			System.out.println("곱하기:" + (a * b));

		};
		action(f);
		action(f2);
		action(f3);
	}

	private static void f1() {
		// 1.구현 Class 이용
		MyClassImplement a = new MyClassImplement();
		a.print();
		// 2.익명구현 Class이용
		(new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명구현 Class이용....");
			}
		}).print();

		MyInterface b = new MyInterface() {

			@Override
			public void print() {
				System.out.println("익명구현 Class이용2....");
			}
		};
		b.print();

		// 3.람다식 이용....JS:화살표함수
		MyInterface c = () -> System.out.println("람다식 이용........");
		c.print();

	}
}
