package com.shinhan.day05;

public class AccountTest {

	public static void main(String[] args) {
		f3();

	}

	private static void f3() {
		CreditLineAccount ca = new CreditLineAccount("123-321-132", "mong", 3000,4000);
		ca.deposit(3000);
		int amount = ca.withdraw(7000);
		
		System.out.println(amount+"출금");
		System.out.println("남은잔액"+ca.getBalance());
	}
	

	private static void f1() {
		Account acc = new Account("123-321-132", "mong", 3000);
		acc.deposit(30000);
		int amount = acc.withdraw(300);
		System.out.println(amount+"출금");
	}
	private static void f2() {
	CheckingAccount ca = new CheckingAccount("123-321-132", "mong", 3000,"300");
		ca.deposit(3000);
		int amount = ca.withdraw(3000);
		System.out.println(amount+"출금");
		
		amount = ca.pay("300", 4000);
		System.out.println(amount+"출금");
		System.out.println("남은잔액"+ca.getBalance());
	}

}
