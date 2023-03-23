package com.shinhan.day05_2;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {

	public static void main(String[] args) {
		f2();

	}

	private static void f5() {
		String[] arr = new String[] {"자바","SQL","WEB","Spring"};
		//List,Set,Map
		//List interface : 순서가 있다. 중복허용.	ArrayList, Vector, LinkedList
		//Set : 순서가 없다. 중복불가.
		List<String> data = new ArrayList<String>();
		data.add("자바");
		data.add("SQL");
		data.add("WEB");
		data.add("자바");
		data.add("Spring");
		
		print(data);
	}
	static void print(List<String> data) {
		
		for(String s:data) {
			System.out.println(s);
		}
		
	}

	private static void f2() {
		f4(new Television());
		f4(new Audio());
	}

	// 자동형변환 + override ==>다형성
	// 사용법은 같고 결과는 다양하다.
	private static void f4(RemoteControl remote) {
		remote.powerON();
		remote.powerOFF();
		remote.display();
		RemoteControl.display2();// static 호출
		if (remote instanceof Audio audio) {
			audio.wifiTrunON();
			audio.display2();
		}
		if(remote instanceof WIFI wifi) {
			wifi.wifiTrunON();
		}
	}

	private static void f1() {
		// 1.객체생성
		OracleDV odb = new OracleDV();
		SybaseDB sdb = new SybaseDB();
		// OracleDB사용
		// StbaseDB사용
		use(sdb);

	}

	private static void use(JDBCInterface db) {
		db.dbConnect("데이터베이스");

	}

}
