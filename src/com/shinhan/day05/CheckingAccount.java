package com.shinhan.day05;

//상속 = 기존class(변경가능) +생성자,field,method추가
public class CheckingAccount extends Account {
	String cardNo;
	CheckingAccount(String accNo, String owner, int balance,String cardNo){
		super(accNo,owner,balance);//명시적으로 부모생성자 생성
		this.cardNo = cardNo;
	}
	public int pay(String cardNo,int amount) {
		if(this.cardNo.equals(cardNo)){
			return withdraw(amount);
		}else {
			System.out.println("카드번호 오류");
			return 0;
		}
	}
	
	void test() {
		System.out.println(getAccNo());
		System.out.println(getOwner());
		System.out.println(getBalance());
		
		deposit(1);
		withdraw(2);
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
