package com.shinhan.day06;

public class Botton {
	//field
	private ClickListener listener;
	//method
	public void setClickListener(ClickListener clickListener) {
		listener = clickListener;
	}
	public void btnClick() {
		listener.onClick();
	}
	//내부 interface
	public static interface ClickListener{
		void onClick();
	}
}
