package com.shinhan.day09;

public class User1Thread extends Thread{
	private Calculator calculator;
	public User1Thread() {
		setName("User1Thread!@#");
	}
	
	void setCacluator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory1(100);
	}
}
