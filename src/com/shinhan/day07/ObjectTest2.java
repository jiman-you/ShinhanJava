package com.shinhan.day07;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashSet;
import java.util.Set;

public class ObjectTest2 {
	public static void main(String[] args) {
		f3();
	}

	private static void f3() {
		Computer c1 = new Computer();
		Computer c2 = new Computer("a" , 123, "LG");
		Computer c3 = new Computer("a" , 123, "LG");
		System.out.println(c2.getModel());
		c1.setMaker("엘지");
		System.out.println(c1.equals(c3));
		
	}

	private static void f2() {
	Person p1 = new Person("홍길동",20);
	System.out.println(p1);	
	System.out.println(p1.name());	
	System.out.println(p1.age());	
	}

	private static void f1() {
		ProductVO p1 = new ProductVO("컴퓨터", 100, "samsung");
		ProductVO p2 = new ProductVO("컴퓨터", 100, "samsung");
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1==p2);//주소비교, 자바는 연산자 재정의 불가
		System.out.println(p1.equals(p2));//재정의 안하면 주소비교
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Set<ProductVO> data = new HashSet<>();
		data.add(p1);
		data.add(p2);
		for(ProductVO p :data) {
			System.out.println(p);
		}
	}
}
