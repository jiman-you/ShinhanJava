package com.shinhan.day06;

public class InnerInterfaceTest {

	public static void main(String[] args) {
		Botton b1 = new Botton();
		Botton b2 = new Botton();
		Botton.ClickListener listener1 = new OkListener();
		Botton.ClickListener listener2 = new CancelListener();
		
		test(b1,listener1);
		test(b2,listener2);
		
		
	}
	
	static void test(Botton b1 , Botton.ClickListener listener) {
		b1.setClickListener(listener);
		b1.btnClick();
	}
}
