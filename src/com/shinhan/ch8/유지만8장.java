package com.shinhan.ch8;

import com.shinhan.ch8_exm.A;
import com.shinhan.ch8_exm.C;
import com.shinhan.ch8_exm.Remocon;
import com.shinhan.ch8_exm.Soundable;
import com.shinhan.ch8_exm.TV;
import com.shinhan.ch8_exm.dataAccessObject;

public class 유지만8장 {
//----5번
	public class TV implements Remocon{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Remocon r = new TV();
			r.powerOn();
		}

		@Override
		public void powerOn() {
			// TODO Auto-generated method stub
			System.out.println("TV를 켯습니다.");
		}

	}
public interface Remocon {
	public void powerOn();
}
//-----6번
public class Cat implements Soundable {

	@Override
	public String sound() {
		String talk = "야옹";
		return talk;
	}

}
public class Dog implements Soundable {

	@Override
	public String sound() {
		String talk = "멍멍";
		return talk;
	}

}
//----7번
public interface dataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}
public class oracleDao implements dataAccessObject {

	@Override
	public void select() {
		System.out.println(getClass().getSimpleName()+"에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(getClass().getSimpleName()+"에서 삽입");	
	}

	@Override
	public void update() {
		System.out.println(getClass().getSimpleName()+"에서 수정");	
	}

	@Override
	public void delete() {
		System.out.println(getClass().getSimpleName()+"에서 삭제");
	}

}
public class MysqlDao implements dataAccessObject {

	@Override
	public void select() {
		System.out.println(getClass().getSimpleName()+"에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println(getClass().getSimpleName()+"에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println(getClass().getSimpleName()+"에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println(getClass().getSimpleName()+"에서 삭제");

	}

}
//-----8번
public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		//action(new B());
		action(new C());
		
	}
	public interface A {

		void method1();

	}
	public class C implements A {

		@Override
		public void method1() {
			// TODO Auto-generated method stub

		}
		public void method2() {
			// TODO Auto-generated method stub
			System.out.println("2 호출");
		}

	}

}
}