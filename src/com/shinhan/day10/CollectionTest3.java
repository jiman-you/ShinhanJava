package com.shinhan.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class CollectionTest3 {
	public static void main(String[] args) {
		f6();
		String[] arr = {"A","B","c"};
		Integer[] arr2 = {100,99,98};
		List<String> data = Arrays.asList(arr);
		List<Integer> data2 = Arrays.asList(arr2);
		
	}
	
	
	private static void f6() {
		Set<Fruit> data = new HashSet<>();
		data.add(new Fruit("귤", 100));
		data.add(new Fruit("귤2", 1100));
		data.add(new Fruit("귤3", 1200));
		data.add(new Fruit("귤4", 1300));
		data.add(new Fruit("귤5", 1300));
		
		Set<Fruit> data2 = Set.copyOf(data);
		
		for(Fruit f : data2) {
			System.out.println(f);
		}
		
	}

	private static void f5() {
		Map<String,Integer> Data = Map.of("김",100,"최",200,
				"유",300); 
		//불가 Data.put("김", 90000);
		for(Entry<String, Integer> a : Data.entrySet()) {
			System.out.println(a);
		}
	}

	private static void f4() {
		Set<Integer> listData = Set.of(100,88,99,55,20);//Set 값은 중복불가
		//불가 listdata.add(11);
		for(Integer a : listData) {
			System.out.println(a);
		}
	}

	//수정불가한 Collection
	private static void f3() {
		
		List<Integer> listData = List.of(100,88,99,55,20);
	
		for(Integer a : listData) {
			System.out.println(a);
		}

	}

	//Queue:FIFO
	private static void f2() {
		Queue<Fruit> data = new LinkedList<>(); //queue는 인터페이스이기에 링크드리스트를 써서 구현한다.
		data.offer(new Fruit("귤", 10000));
		data.offer(new Fruit("귤2", 20000));
		data.offer(new Fruit("귤3", 30000));
		data.offer(new Fruit("귤4", 40000));
	
		while(!data.isEmpty()) {
			Fruit f = data.poll();
			System.out.println(f);
		}
	}

	//Stack: LIFO
	private static void f1() {
		Stack<Fruit> data = new Stack<>();		
		data.push(new Fruit("귤", 10000));
		data.push(new Fruit("귤2", 20000));
		data.push(new Fruit("귤3", 30000));
		data.push(new Fruit("귤4", 40000));
	
		while(!data.isEmpty()) {
			Fruit f = data.pop();
			System.out.println(f);
		}
		
	}
}
