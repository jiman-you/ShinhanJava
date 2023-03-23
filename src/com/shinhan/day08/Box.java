package com.shinhan.day08;

public class Box {
	Object kind;
	public Object getKind() {
		return kind;
	}
	public void setKind(Object kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Box(Object kind, int price) {
		super();
		this.kind = kind;
		this.price = price;
	}
	int price;
}
