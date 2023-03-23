package com.shinhan.day11.ch16;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.shinhan.day09.Account;

public class LambdaTest3 {

	public static void main(String[] args) {
		f7();

	}

	//생성자 참조 class::new
	private static void f7() {
		BiFunction<String, String, Account> func1 = (no, owner) -> {
			System.out.println("계좌번호:" + no);
			System.out.println("이름:" + owner);
			return new Account(no, owner);
		};
		BiFunction<String, String, Account> func2 =  Account::new ;
	
		Account acc = func1.apply("123", "dPrmawn");
		Account acc2 = func2.apply("123", "dPrmawn");
		System.out.println(acc);
		System.out.println(acc2);
	}

	//메소드 참조class::method
	private static void f6() {
		BiFunction<Integer, Integer, Integer> f1 = (a,b)->{
			if(a>b) return a; else return b;
		};
		BiFunction<Integer, Integer, Integer> f2 = (a,b)->Math.max(a, b);
		BiFunction<Integer, Integer, Integer> f3 = Math::max;
		//정적 메소드를 참조시 클래스 이름 뒤에 ::기호를 붙이고 정적 메소드 이름 기술
		int result = f3.apply(10, 21);
		System.out.println(result);
}

	private static void f5() {
		// Predicate 매개값을 조사해 boolean리턴
		Predicate<Integer> f1 = (a) -> a > 10;
		boolean result = f1.test(3);
		System.out.println(result);
		
		Predicate<Account> f2 = (a)->{
			System.out.println("Account잔고조사---");
			System.out.println(a);
			return a.getBalance()>100;
		};
		result = f2.test(new Account("213","dsad",221));
		System.out.println(result);
	}

	private static void f4() {
		// 매개값있고 리턴있다
		BinaryOperator<Integer> f1 = (a, b) -> a + b;
		BinaryOperator<Integer> f2 = (a, b) -> a - b;
		System.out.println(f1.apply(1, 3));
		System.out.println(f2.apply(1, 3));

	}

	private static void f3() {
		// Function 매개값 있고 리턴 있음
		Function<String, Account> func1 = (a) -> new Account(a, null, 110);
		BiFunction<String, String, Account> func2 = (no, owner) -> {
			System.out.println("계좌번호:" + no);
			System.out.println("이름:" + owner);
			return new Account(no, owner, 110);
		};

		Account acc1 = func1.apply("123");
		Account acc2 = func2.apply("234", "kang");
		System.out.println(acc1);
		System.out.println(acc2);
	}

	// 생산자
	private static void f2() {
		// Supplier 매개값은 없고 리턴있음
		Supplier<String> a = () -> "자바";
		Supplier<String> b = () -> {
			System.out.println("------------");
			return "자바2";
		};
		Supplier<Account> c = () -> new Account();

		String ret1 = a.get();
		String ret2 = b.get();
		System.out.println(ret1);
		System.out.println(ret2);
		System.out.println(c.get());
	}

	private static void f1() {
		// Consumer 인터페이스 : 자바 api에서 제공하는 람다도움인터페이스- 매개값은 있고 리턴없음
		Consumer<Integer> f = (a) -> System.out.println(a + 200);
		Consumer<String> f2 = (a) -> System.out.println(a + 200);
		Consumer<Account> f4 = (a) -> {
			System.out.println(a);
			int result = a.withdraw(100);
			System.out.println(result + "출금완료");

		};

		f.accept(100);
		f2.accept("지갑에 남은돈");
		f4.accept(new Account("123", "ss", 12212));
		// 매개변수가 2개일 경우 BiConsumer
		BiConsumer<String, Integer> f3 = (a, b) -> {
			System.out.println("a=" + a);
			System.out.println("b=" + b);
		};
		f3.accept("자바시험", 100);
	}

}
