package com.shinhan.day11.ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.shinhan.day09.Account;

public class StreamTest1 {
	public static void main(String[] args) {
		f6();
	}

	private static void f6() {
		// List컬렉샨
		Account[] arr = { 
				new Account("123", "asd1"),
				new Account("1232", "asd2"), 
				new Account("1232", "asd2"), 
				new Account("1232", "asd2"), 
				new Account("1232", "asd2"), 
				new Account("1232", "asd2"), 
				new Account("1233", "asd3") };
		List<Account> data = Arrays.asList(arr);// 이미 있는 배열 리스트로 바꾸기 (수정불가)
		data.parallelStream().forEach(acc -> {//컬렉션은 parallelStream()메소드를 사용하면 병렬처리가 가능하다.
			System.out.println(acc);
			System.out.println(Thread.currentThread().getName());
			System.out.println("--------");
		});// 중간처리가 가능한 형태

		
	}

	private static void f5() {
		// List컬렉샨
		Set<Account> data = new HashSet<>();
		data.add(new Account("123", "asd1"));
		data.add(new Account("1232", "asd2"));
		data.add(new Account("1233", "asd3"));

		data.stream().forEach(acc -> System.out.println(acc));// 중간처리가 가능한 형태

		data.forEach(acc -> System.out.println(acc));// 단순 반복

	}

	private static void f4() {
		// List컬렉샨
		Account[] arr = { new Account("123", "asd1"), new Account("1232", "asd2"), new Account("1233", "asd3") };
		List<Account> data = Arrays.asList(arr);// 이미 있는 배열 리스트로 바꾸기 (수정불가)
		data.stream().forEach(acc -> System.out.println(acc));// 중간처리가 가능한 형태

		data.forEach(acc -> System.out.println(acc));// 단순 반복

	}

	private static void f3() {
		Account[] arr = { new Account("123", "asd1"), new Account("1232", "asd2"), new Account("1233", "asd3") };
		Arrays.stream(arr).forEach(acc -> System.out.println(acc));

	}

	private static void f2() {
		// 문자열배열
		String[] arr1 = new String[] { "자바", "웹", "front", "back" };
		// 1.내부 반복자를 이용하자고 한다면 먼저 Stream을 얻는다.
		Stream<String> st = Arrays.stream(arr1);
		// 2.내부반복자로 값을 처리한다
		Consumer<String> consumerF = s -> System.out.println(s + "******");
		;
		st.forEach(consumerF);

		Arrays.stream(arr1).forEach(consumerF);// forEach는 내부반복자로 for문과 비슷

	}

	private static void f1() {
		// 1.배열
		int[] arr1 = new int[] { 100, 20, 30, 50, 1 };
		Arrays.stream(arr1).forEach((a) -> {
			System.out.println(a);
		});// arr1을 스트림으로 만들어 forEach의 람다식으로 해결

		// original Stream
		IntStream is = Arrays.stream(arr1);
		IntConsumer func1 = (a) -> {
			System.out.println("a=" + a);
		};
		is.forEach(func1);

	}
}
