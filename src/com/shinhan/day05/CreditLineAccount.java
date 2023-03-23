package com.shinhan.day05;

public class CreditLineAccount extends Account {
	int creditLine;

	public CreditLineAccount(String accNo, String owner, int balance, int creditLine) {
		super(accNo, owner, balance);
		this.creditLine = creditLine;
	}

	// override(덮어쓰기): 시그니처가 같아야한다.
	// 이름 모양 매개변수 리번 타입이 모두 같아야한다. modifire은 같거나 더 넓어져야한다.
	@Override // 자바가 미리 제공하는 체크하는거
	public int withdraw(int amount) {
		int total = getBalance() + creditLine;
		if (amount > total) {
			System.out.println("잔고부족");
			return 0;
		}
		setBalance((getBalance() - amount));
		return amount;
	}

	@Override//맞앗나 틀렷나 확인하는거 생략가능
	public void deposit(int amount) {
		System.out.println("입금하다...override test");
		super.deposit(amount);
	}

	void test() {
		System.out.println(getAccNo());
		System.out.println(getOwner());
		System.out.println(getBalance());
		deposit(100);
		withdraw(1000);
	}

}
