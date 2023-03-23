package com.shinhan.day08;

public class Money {
    int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add(Money money) {
        //더하기 구현 new MOney(amount+money.aount);
    	Money my = new Money(this.amount);
    	my.amount+=money.amount;
    	return my;
    }
    public Money minus(Money money) {
        //빼기 구현
    	Money my = new Money(this.amount);
    	my.amount-=money.amount;
    	return my;
    }
    public Money multiply(Money money) {
        //곱하기 구현
    	Money my = new Money(this.amount);
    	my.amount*=money.amount;
    	return my;
    }
    public Money devide(Money money) {
        //나누기 구현
    	Money my = new Money(this.amount);
    	my.amount/=money.amount;
    	return my;
    } 
    @Override
	public String toString() {
		return "Money [amount=" + amount + "]";
	}
	public boolean equals(Object object) {
        //Object equals 메쏘드 재정의
    	//if(this. == object) return true;//주소 같으면 같다.
    	//if(object == null||getClass)_!=object.getClass()) return false;
    	//return amount == ((Money).object).amount;
    	 Money my = (Money)object;
    	 if(this.amount  == my.amount) {
    		 return true;
    	 }else return false;
    }
    public static void main(String[] args){
        Money five  = new Money(5);
        Money two   = new Money(2);
        Money three = new Money(3);
        Money ten   = new Money(10);
        
        if( five.equals(two.add(three))
            && three.equals(five.minus(two))
            && ten.equals(five.multiply(two))
            && two.equals(ten.devide(five)) )  {
            System.out.println("Money Class 구현을 완료 하였습니다.");
        }
    }
}
