package com.shinhan.day05;

//부모 class로 사용할 예쩡
public class Account extends Object{
	//1.field
	private String accNo;
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	private String owner;
	private int balance;
	//생성자
	public Account() {
		super();//부모클래스 객체 먼저생성
	}
	public Account(String accNo, String owner, int balance) {
		super();
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	//메서드
	public void deposit(int amount) {
		balance+=amount;
	}
	public int withdraw(int amount) {
		if(amount>balance) {
			System.out.println("잔고부족");
			return 0;
		}
		balance-=amount;
		return amount;
			}
}
