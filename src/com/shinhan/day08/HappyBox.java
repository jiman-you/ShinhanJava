package com.shinhan.day08;

public class HappyBox <T>{
	T kind;
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public HappyBox(T kind, int price) {
		super();
		this.kind = kind;
		this.price = price;
	}
	int price;
}
