package com.shinhan.day05_2;

import java.util.Arrays;

public class ExchangeStudent extends Student {
	String[] language;

	public ExchangeStudent(String stdId, String name, String[] language) {
		super(stdId, name);// 1. 부모에서 defalut 생성자를 정의
						   // 2. 명시적으로 생성자를 호출
		// this.setStdid(stdId);
		// this.name = names;
		this.language = language;
	}
	
	void display() {
		System.out.println(getClass().getSimpleName()+"에서 추가된 메서드");//현재 클래스이름 가져오기
	}

	@Override
	public String toString() {
		String aa = super.toString();
		return aa+ "ExchangeStudent [language=" + Arrays.toString(language) + "]";
	}
	
}
