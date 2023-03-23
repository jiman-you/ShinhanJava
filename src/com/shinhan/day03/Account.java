package com.shinhan.day03;
//계좌(Account) 클래스는 계좌 번호를 나타내는 accNo 데이터와 잔고를
//나타내는 balance 데이터를 가지고 있습니다.
//함수로는 입금을 의미하는 save 함수와 출금을 의미하는 deposit 함수 및 잔고를
//확인하는 getBalance 함수와 계좌 번호를 확인하는 getAccNo 함수를 가지고 있습니다. 
//TestAccount 클래스를 이용하여 Account 클래스의 함수를 호출시켰을 때 콘솔에 출력되는 결과는
//다음과 같습니다.
//
//[TestAccount 실행결과]
//078-3762-293 계좌가 개설되었습니다.
//078-3762-293 계좌의 잔고는 1000000원입니다.
//078-3762-293 계좌에 2000000원이 입금되었습니다.
//078-3762-293 계좌의 잔고는 3000000원입니다.
//078-3762-293 계좌에 500000원이 출금되었습니다.
//078-3762-293 계좌의 잔고는 3500000원입니다.

public class Account {
	private String AccNo;
	private int Balance;
	
	Account(String AccNo,int Balance){
		this.AccNo = AccNo;
		this.Balance = Balance;
		System.out.println(AccNo
				+"계좌가 개설되었습니다.");
		System.out.println(AccNo
				+"계좌에 잔고는"
				+ Balance
				+ " 원입니다.");
		
	}
	void deposit(int money){
		this.Balance+= money;
		System.out.println(AccNo
				+"계좌에"
				+ money
				+"원이 입급되었습니다.");
		System.out.println(AccNo
				+"계좌에 잔고는"
				+ Balance
				+ " 원입니다.");
		
	}
	void withdraw(int money){
		this.Balance-= money;
		System.out.println(AccNo
			+"계좌에"
			+ money
			+"원이 출금되었습니다.");
		System.out.println(AccNo
				+"계좌에 잔고는"
				+ Balance
				+ " 원입니다.");
		
	}
	//getter 정보은닉에 의해 정보접근을 못하니 외부에서 읽어가도록 만듦.
	public int getBalance() {
		return Balance;
	}
	public String getAccNo() {
		return AccNo;
	}
	public static void main(String[] args) {
		Account acc = new Account("123- 21-3 12", 222222);
		
	}
}
