package com.shinhan.day11.ch16;

//함수형 표현...람다식...람다표현식으로 표현 가능한가?@FunctionalInterface
//interface에 한개의 메서드만 존재해야한다.
@FunctionalInterface
public interface Caculable {
	//추상 메서드 정의
	void caculate(int x, int y);
}
