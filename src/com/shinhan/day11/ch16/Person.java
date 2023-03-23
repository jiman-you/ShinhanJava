package com.shinhan.day11.ch16;

public class Person {
	public void Action1(Workable workable) {
		workable.work("홍길동","프로그램");
	}
	public void Action2(Speakable speakable) {
		String result = speakable.speak("방갑슴니다");
		System.out.println(result);
		
	}
}
