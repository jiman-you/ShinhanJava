package com.shinhan.day09;

public class User2Thread extends Thread{
	private Calculator calculator;
	public User2Thread() {
		setName("User2Thread!@#");
	}
	
	void setCacluator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory1(50);
	}
}
