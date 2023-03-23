package com.shinhan.day05;

//VO(Value Object): data를 저장하는 가방
//DTO(Data Transfer Object):data를 저장해서 전송할는 목적으로 만든 class이다.
//javabeands 기술에서 사용한다.
//멤버변수는 private으로 설정. 메메버 메서드는public으로 설정한다.
public class BookVO {
	// instance변수
	private String title;
	private int price;
	// class 변수
	static int count = 0;
	// final 수정불가, instance
	final String isbn = "asdas";
	final String isbn2;
	// static final 수정불가 상수 ,class - 선언시 초기화
	// 상수는 대문자로
	static final String SANGSOO = "qwer";
	// final: 변수(값 수정 불가), 메서드(오버라이드 불가), 클래스(상속불가)

	public BookVO(String title, int price) {
		System.out.println("day 6에있다.");
		this.title = title;
		this.price = price;
		isbn2 = title + price + "ddass";
		count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + "]";
	}

}
