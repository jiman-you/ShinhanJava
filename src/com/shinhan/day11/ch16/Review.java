package com.shinhan.day11.ch16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Review {

	public static void main(String[] args) {
		f2();

	}

	private static void f2() {
		List<Integer> data1 = new ArrayList<Integer>();
		Set<Integer> data2 = new HashSet<Integer>();
		Map<String,Integer> data3 = new HashMap<String,Integer>();
		data1.add(200);
		data2.add(300);
		data3.put("aa",400);
		
		System.out.println(data1.get(0));
		//set 가져오는 방법
		for(Integer a:data2) {
			System.out.println(a);
		}
			//내부반복자를 생성.
		Iterator<Integer> it = data2.iterator();
		while(it.hasNext()) {//다음 내용이 있는지 물어봄
			System.out.println(it.next());
		}
		
		int value = data3.get("aa"); //맵은 키가 있으면 값을 가져올수있다.
		Set<String> keys = data3.keySet();
		for(String key:keys) {
			int value2 = data3.get(key);
			System.out.println(value2);
		}
		
		Set<Entry<String,Integer>>  ent= data3.entrySet();
		for(Entry<String,Integer> en:ent) {
			System.out.println(en.getKey()+en.getValue());
		}
		Iterator<Entry<String,Integer>> it2 = ent.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> en = it2.next();
			System.out.println(en.getKey()+en.getValue());
		}
	}

	private static void f1() {
		//Collection:List(순서있고 중복가능),Set(순서없고 중복불가)
		//Map(키와 값의 쌍=엔트리)
		//List구현class: ArrayList,LinkedList,Vector
		//Set구현class:HashSet(중복check:equals(),hashcode()),
		//data추가시 순서를 정해짐 (크기비교 CompareTo()) TreeSet
		//Map구현class:HashMap(키가 Set이다 동일하다면 키의 중복은 안되지만 값은 덮어쓰기)
		//,TreeMap,Properties(엔트리가 문자고정)
		
	}

}
