package com.shinhan.ch12_exm;

import java.util.HashSet;

public class StudentExample {
	public static void main(String[] args) {
		//Student를 저장하는 hashSet생성
		HashSet<Student> hashSet = new HashSet<Student>();
		
		//student저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));//같은 학번이므로 중복저장안됨
		hashSet.add(new Student("3"));
		
		//저장된 Student 수 출력
		System.out.println("저장된 Student 수:"+hashSet.size());
	}
}
