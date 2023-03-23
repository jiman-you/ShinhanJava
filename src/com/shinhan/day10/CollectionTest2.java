package com.shinhan.day10;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.shinhan.day04.Employee;
import com.shinhan.day09.Account;

//List:순서있음,중복가능 ArrayList, LinkedList, Vector(멀티스레드 환경에서 동기화 지원)
//Set:순서없음, 중복불가
//Map:키와 값의 쌍
//HashSet: hashcode(),equals()로 동등비교 - 동등하면 add불가
//TreeSet:compareTo()로 크기비교 - 

public class CollectionTest2 {
	public static void main(String[] args) {
		f8();
	}

	
	
	private static void f8() {
		TreeMap<String,Fruit> data =new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});//맵은 키가 중복되면 키는 유지하고 값은 덮어쓴다.
		data.put("S",new Fruit("사과", 3000));
		data.put("A",new Fruit("사과", 4000));
		data.put("B",new Fruit("바나나", 2000));
		data.put("A",new Fruit("망고", 5000));
		data.put("S",new Fruit("오렌지", 1000));
		
		for(Entry<String, Fruit> entry : data.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}System.out.println("========");
		NavigableMap<String, Fruit> data2=data.descendingMap();//desc
		for(Entry<String, Fruit> entry : data2.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}



	private static void f7() {
		Set<Fruit> data = new HashSet<>();
		data.add(new Fruit("사과", 3000));
		data.add(new Fruit("사과", 4000));
		data.add(new Fruit("바나나", 2000));
		data.add(new Fruit("망고", 5000));
		data.add(new Fruit("오렌지", 1000));
		
		for(Fruit fruit : data) {
			System.out.println(fruit);
		}
	}



	private static void f6() {
		Set<Board> data = new TreeSet<>();
		data.add(new Board(1, "회식'", "술머셔도되나요?", "졸린애"));
		data.add(new Board(2, "자율학습'", "저녁개방?", "개굿"));
		data.add(new Board(3, "아침'", "빨리와", "에반뎅"));
		data.add(new Board(4, "회식'", "술머셔도되나요?", "졸린애"));
		data.add(new Board(5, "회식'", "술머셔도되나요?", "졸린애"));
		
		for(Board bo : data) {
			System.out.println(bo);
		}
	}



	private static void f5() {
		TreeMap<String, Integer> data = new TreeMap<>();
		data.put("헝길덩1", 33);
		data.put("헝길덩5", 23);
		data.put("헝길덩4", 63);
		data.put("헝길덩2", 13);
		data.put("헝길덩2", 83);
		
		for(String key:data.keySet()) {
			System.out.println(key+"==>"+data.get(key));
		}
		System.out.println("first Key:"+data.firstKey());
		System.out.println("firstkey의 값"+ data.get(data.firstKey()));
		System.out.println("LastEntry"+ data.lastEntry());
		System.out.println("lowerEntry"+ data.lowerKey("헝길덩4"));
		
		NavigableMap<String,Integer> data2 = data.descendingMap();

		for(String key:data2.keySet()) {
			System.out.println(key+"==>"+data2.get(key));
		}
	}



	private static void f4() {
		TreeSet<Integer> scores=new TreeSet<>();
		
		scores.add(10);
		scores.add(30);
		scores.add(30);
		scores.add(70);
		scores.add(90);
		scores.add(20);
		
		for(Integer jumsu:scores) {
			System.out.println(jumsu);		
		}
		System.out.println("first:"+scores.first());
		System.out.println("last:"+scores.last());
		System.out.println("higher:>"+scores.higher(50));
		System.out.println("lower:<"+scores.lower(50));
		System.out.println("ceiling:>="+scores.ceiling(50));
		System.out.println("floor:<="+scores.floor(50));
		
		System.out.println("tail set====='");
		
		SortedSet<Integer> data =  scores.tailSet(50);
		for(Integer i: data) {
				System.out.println(i);
		}
	}



	private static void f3() {
		Set<Employee> data = new TreeSet<>();
		data.add(new Employee("직원1", "사원", 1000));
		data.add(new Employee("직원3", "과장", 2000));
		data.add(new Employee("직원2", "대리", 4000));
		data.add(new Employee("직원5", "사원", 3000));
		data.add(new Employee("직원6", "사원", 2000));
		data.add(new Employee("직원1", "사원", 13000));
		
		for(Employee emp:data) {
			System.out.println(emp);
		}
	}

	private static void f2() {
		Set<Account> data = new TreeSet<>();// 비교해서 순서대로
		data.add(new Account("1234", "홍", 333));
		data.add(new Account("1234", "홍2", 4134));
		data.add(new Account("1234", "홍3", 3331512));
		data.add(new Account("1234", "홍4", 3342323));
		data.add(new Account("1234", "홍", 333));

		for (Account acc: data) {
			System.out.println(acc);
		}

	}


	private static void f1() {
		Set<String> data = new TreeSet<>();// 순서대로
		data.add("월1");
		data.add("월1");// 이미 있는 키는 중복되지않는다.
		data.add("월3");
		data.add("월4");
		data.add("월2");
		data.add("월5");

		for (String s : data) {
			System.out.println(s);
		}

	}
}
