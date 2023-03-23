package com.shinhan.day06;

public class AnoTest {

	public static void main(String[] args) {
		f4();

	}

	public static void f4() {
		RemoteControl tv = new RemoteControl() {
			int a = 10;
			public void method() {//외부에서 호출이 안된다 = 타입이 리모콘인데 리모콘에는 method를 정의 안햇기 때문에 접근못함.
				System.out.println("구현 클래스에서 메서드 추가");
			}
			public void turnOn() {
				System.out.println("tv가 켜졋다");
				method();
			}
			public void turnOff() {

				System.out.println("tv가 꺼졋다");
				
			}
		};
		tv.turnOn();
		tv.turnOff();
		
		
	}

	private static void f3() {
		(new Colorable() {

			@Override
			public void setForeground(String color) {
				System.out.println("익명...fore" + color);
			}

			@Override
			public void setBackground(String color) {
				System.out.println("익명...back" + color);

			}
		}).setBackground("green");
		}

	private static void f2() {
		// 2.익명객체 -한번쓰고 버릴때 많이 씀
		Colorable a = new Colorable() {

			@Override
			public void setForeground(String color) {
				System.out.println("익명...fore" + color);
			}

			@Override
			public void setBackground(String color) {
				System.out.println("익명...back" + color);

			}
		};
		a.setBackground("black");
		a.setForeground("o");
	}

	private static void f1() {
		// 1.일반적인 방법
		Book book = new Book();
		book.title = "이것이 자바다";
		book.setForeground("white");
		book.setBackground("blue");

		Cup cup = new Cup();
		cup.size = 10;
		cup.setForeground("black");
		cup.setBackground("red");
	}

}
