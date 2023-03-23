package com.shinhan.ch13;

import com.shinhan.day08.HappyBox;

import lombok.Getter;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String,String> container1 = makeContainer();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String,Integer> container2 = makeContainer();
		container2.set("홍길동",6);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
	}private static <T>HappyBox<T> Boxing(T kind) {
	
		return new HappyBox<T>(kind, 1000);
	}
	private <K,V>Container2<K, V> makeContainer(K key , V value) {
		
		return new Container2<K,V>(key,value);
			
	}
}
