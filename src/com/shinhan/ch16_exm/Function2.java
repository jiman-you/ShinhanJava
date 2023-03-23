package com.shinhan.ch16_exm;

//interface: 규격서 (반드시 규칙을 지켜라)
//정의되어있는 추상메서드를 구현class가 반드시 구현해야한다.
//T는 제네릭타입...사용시 결정한다.
//람다표현식으로 가능한 interface이고자한다->추상 메서드가 1개만 존재해야한다
//람다표현식이아니라면 구현class를 만들거나 익명구현class를 만든다.->추상 메서드 여러개 가능하다


@FunctionalInterface
public interface Function2<T> {
	public double apply(T t);
}
