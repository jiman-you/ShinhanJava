package com.shinhan.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

import com.shinhan.day04.Employee;
import com.shinhan.day04.EmployeeExam;
import com.shinhan.day09.Account;

public class CollerctionTest1 {
	public static void main(String[] args) throws IOException {
		f9();
	}

	private static void f9() throws IOException {
		
		Properties pro = new Properties();
//		InputStream fis = new FileInputStream("src/com/shinhan/day10/Oracleinfo.properties");
//		pro.load(fis);
//		pro.load(CollerctionTest1.class.getResourceAsStream("Oracleinfo.properties"));
		InputStream is = CollerctionTest1.class.getResourceAsStream("Oracleinfo.properties"); 
		String driver = pro.getProperty("driver");
		System.out.println(driver);
		
		for(Object key:pro.keySet()) {
			String value = pro.getProperty((String) key);
			System.out.println(key+"->"+value);
		}
	}

	private static void f8() {
		//Key는 Set이다.
		//Set은 add시에 동등객체인지 확인. 동등하면 add불가
		//Map은 put()시에 key를 찾는다. 동등한 것을 찾으면 값을 새로고침. => key는 유지 value는 새로고침
		Map<Employee,Account> data = new HashMap<>();
		data.put(new Employee("영희", "대리", 123123), new Account("1234","영희",123123));
		data.put(new Employee("영희", "대리", 123123), new Account("1234","영희",123123));
		data.put(new Employee("영희2", "대리2", 3123123), new Account("12342","영희2",1223123));
		data.put(new Employee("영희3", "대리3", 123123), new Account("12334","영희3",1323123));
		data.put(new Employee("영희34", "대리43", 1523123), new Account("12334","영희3",13234123));
		
		for(Employee emp:data.keySet()) {
			System.out.println("Key:"+emp);
			System.out.println("value:"+data.get(emp));
		}
		System.out.println("키를 찾고싶어:"+data.containsKey(new Employee("영희", "대리", 123123)));
		System.out.println("값을 찾고싶어:"+data.containsValue( new Account("1234","영희",123123)));
	}

	private static void f7() {
		//Map: 키와 값의 쌍=Entry. 키는 set(중복불가)
		//구현class: HashMap,HashTable
		HashMap<String,Integer> data = new HashMap<>();
		data.put("김", 100);
		data.put("박", 30);
		data.put("정", 51);
		data.put("굼", 53);
		data.put("김", 84);
		
		System.out.println("키가 중복되면 마지막 값이 유효:"+data.get("김"));
		
		//1.일반for--불가
		//2.향상for
		//entry는 1건을 의미, entrySet은 여러건을 의미
		int sum = 0;
		for(Entry<String, Integer> en:data.entrySet()) {
			System.out.println(en.getKey()+"==>"+en.getValue());
			sum+=en.getValue();
		}
		System.out.println("총점은"+sum);
		sum=0;
		//KeySet():키의 집합
		for(String key:data.keySet()) {
			System.out.println(key+"==>"+data.get(key));
			sum+=data.get(key);
		}
		System.out.println("총점은"+sum);
		
		Iterator<String> it =  data.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);//다음 데이터 읽기
			System.out.println(data.get(key));
			System.out.println("+======");
		}
		System.out.println("키 찾기:"+ data.containsKey("김"));
		System.out.println("키 찾기:"+ data.containsKey("김2"));
	
		System.out.println("값 찾기:"+ data.containsValue(100));
		System.out.println("값 찾기:"+ data.containsValue(53));
	}

	private static void f6() {
		// Set interface => 구현 class : HashSet , TreeSet
		// 순서없고 중복불가( 단 , Tree는 순서있읍)
		Set<Account> data = new HashSet<>();
		data.add(new Account("123", "예금주", 200));
		data.add(new Account("123", "예금주", 200));
		data.add(new Account("1223", "2예금주", 2200));
		data.add(new Account("1233", "예3금주", 2300));
		data.add(new Account("1234", "예금4주", 2004));

		// 1.일반for--불가 .. 순서가 없으므로 index사용안됨
		// 2.향상for for(객체타입 변수:객체)
		for (Account acc : data) {
			System.err.println(acc);
		}
		System.out.println("============");
		// 3.iterator(내부반복자)
		Iterator<Account> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Set에서 원하는 객체 찾기
		Account searchData = new Account("1234", "예금4주", 2004);
		boolean result = data.contains(searchData);
		System.out.println(result?"찾음":"못찾음");
		
	}

	private static void f5() {
		// Set interface => 구현 class : HashSet , TreeSet
		// 순서없고 중복불가( 단 , Tree는 순서있읍)
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("토요일");
		data.add("토요일");
		data.add("일요일");

		// 1.일반for--불가 .. 순서가 없으므로 index사용안됨
		// 2.향상for for(객체타입 변수:객체)
		for (String week : data) {
			System.err.println(week);
		}
		System.out.println("============");
		// 3.iterator(내부반복자)
		Iterator<String> it = data.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void f4() {
		// ArrayList는 중간의 data를 삽입하거나 삭제시 앞으로 당기는 작업 때문에 느리다.
		List<Account> data = new ArrayList<>();
		long start = System.nanoTime();

		for (int i = 1; i <= 100000; i++) {
			data.add(new Account((i * (i + 3)) + "", "홍" + i, 100));
		}
		for (int i = 100; i < 200; i++) {
			data.remove(100);
		}
		for (int i = 100; i < 200; i++) {
			data.add(new Account((i * (i + 3)) + "", "홍" + i, 100));
		}

		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸린시간" + df.format(end - start) + "ns");
	}

	// Vertor는 멀티스레드에 안정적이다. ...동기화가 된다
	private static void f3() {
		List<Account> data = new Vector<>();
		long start = System.nanoTime();
		// 2000건을 add하고자 한다. 2개의 흐름을 만들어서 각자 1000건씩 해결
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					data.add(new Account((i * (i + 3)) + "", "홍" + i, 100));
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					data.add(new Account((i * (i + 3) / 3) + "", "홍" + i, 100));
				}
			}
		};
		t1.start();
		t2.start();
		try {
			t1.join();// 다 끝나고나면 진행해라
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(data.size() + "건이 저장되엇습니다..");

		for (int i = 0; i < 100; i++) {
			data.remove(0);
		}

		long end = System.nanoTime();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("걸린시간" + df.format(end - start) + "ns");
	}

	private static void f2() {
		// List interface: 구현 class +>AllayList, LinkedList, Vector
		List<String> data = new ArrayList<String>();
		data.add("자바1");
		data.add("자바2");
		data.add("자바3");
		data.add("자바4");
		data.add("자바5");
		System.out.println(data.size() + "개");

		// 1.일반 for
		for (int i = 0; i < data.size(); i++) {
			System.out.println(i + "번째" + data.get(i));
		}
		// 2.향상for
		System.out.println("====향상포===");
		for (String s : data) {
			System.out.println(s);
		}
		System.out.println("====iterator===");

		Iterator<String> it = data.iterator();
		while (it.hasNext()) {// 다음값이 존재하냐
			String s = it.next();
			System.out.println(s);
		}

	}

	// 제네릭 사용하지 않는것은바람직하지않다
	private static void f1() {
		// List interface: 구현 class +>AllayList, LinkedList, Vector
		List data = new ArrayList();
		data.add(100);// ArrayList는 데이터를Object타입으로 받기때문에 모든 타입을 받을 수 있다.
		data.add("자바");
		data.add(new Account("123", "ghd", 123));

		int a = (Integer) data.get(0);// 하지만 추출하기 위해서는 형변환이 필요하다
		String s = (String) data.get(1);
		Account acc = (Account) data.get(2);

	}
}
