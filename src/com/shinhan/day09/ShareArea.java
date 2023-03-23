package com.shinhan.day09;

import lombok.AllArgsConstructor;

//공유자원으로 이용할 class
//2개의 계좌가 있다
@AllArgsConstructor
public class ShareArea {

	Account sung;
	Account lee;
	
	void transfer() {
		//syncronized 블록
		synchronized (this) {//share객체에 락을 걸어서 내가 이 객체를 쓸때는 접근못하게하겟다
			// 출금한다
			int amount = lee.withdraw(100);
			System.out.println("lee 계좌에서" + amount + "출금");
			// 입금한다
			sung.deposit(amount);
			System.out.println("sung 계좌에서" + amount + "입금");
		}
	}
	//매서드 활용방법이용
	synchronized void printBalance() {
		System.out.println("잔액:" + (lee.getBalance() + sung.getBalance()));
	}
}
