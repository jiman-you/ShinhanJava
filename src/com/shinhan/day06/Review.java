package com.shinhan.day06;

/*
  1.변수: 데이터를 저장하기위한 기억장소이름-값 수정가능
  2.상수: 데이터를 저장하기위한 기억장소이름-값 수정불가
  3.enum: 상수묶음
  4.method: 문장들을 묶음
  5.class: object를 만드는 틀 변수+상수+method
  6.object: class로 new한 실체 
  7.interface: 규격서 상수+추상메서드 +default method+static method
  	인터페이스는 다중상속이 가능하다
 */
abstract class ParentClass{
	abstract void method1();
}
interface MyInterface{
	public abstract void method2();
}
interface MyInterface2{
	public abstract void method2_1();
}
interface MyInterface3 extends MyInterface, MyInterface2{
	public abstract void method3_1();
}
class MyClass1 extends ParentClass implements MyInterface{
	void method1() {
		
	}
	public void method2() {
		
	}
}
class MyClass2 extends ParentClass implements MyInterface3{
	void method1() {
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2_1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3_1() {
		// TODO Auto-generated method stub
		
	}
}

public class Review {

	public static void main(String[] args) {
		ParentClass v2 = new MyClass2();
		work(v2);
	}
	static void work(ParentClass aa) {
		if(aa instanceof MyClass1 v1) {
		v1.method1();
		v1.method2();
		}
		if(aa instanceof MyClass2 v2) {
			v2.method1();
			v2.method2();
			v2.method2_1();
			v2.method3_1();
		}
	}
}
