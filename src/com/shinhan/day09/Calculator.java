package com.shinhan.day09;

import lombok.Getter;

@Getter
public class Calculator {
	private int memory;

	public synchronized void setMemory1(int memory) {
		synchronized (this) {
			this.memory = memory;
			System.out.println(Thread.currentThread().getName()+"==>메모리 저장값:"+this.memory);
				
		}
		
	}
//	public synchronized void setMemory1(int memory) {
//		this.memory = memory;
////		try {
////			Thread.sleep(2000);
////		} catch (InterruptedException e) {}
//		System.out.println(Thread.currentThread().getName()+"==>메모리 저장값:"+this.memory);
//		
//	}
	public void setMemory2(int memory) {
		this.memory = memory;
	}
	
	
	
}
