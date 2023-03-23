package com.shinhan.javatest;
class Prob3 {
	public static void main(String args[]){
		PhoneCharge skt = new PhoneCharge("김현우", 100, 50, 1);
		PhoneCharge ktf = new PhoneCharge("신희만", 200, 100, 2);
		PhoneCharge lgt = new PhoneCharge("조유성", 150, 500, 10);
		skt.printCharge();
		ktf.printCharge();
		lgt.printCharge();
	}
}

class PhoneCharge{	
	//구현하시오.
		private String user;
		private int call;
		private int sms;
		private int data;
		private int total;

		
		public PhoneCharge (String user, int call, int sms, int data) {
			//같은 이름의 멤버변수 값으로 초기화하는 문장을 정의한다. 
			this.user = user;
			this.call = call;
			this.sms=sms;
			this.data = data;
			}
		
		public int calcCharge() {
			int callFee;
			if(call>200) {
				callFee=call*10*2;
			}else callFee=call*10;
			
			int smsFee;
			if(sms>300) {
				smsFee=sms*20*4;
			}else smsFee=sms*20;
			
			int dataFee;
			if(data>7) {
				dataFee=data*1000*2;
			}else dataFee=data*1000;
			
			this.setTotal(callFee+smsFee+dataFee);
			return total;
		}
		
		public void setTotal(int total) {
			this.total = total;
		}

		public int getTotal() {
			return total;
		}

		public void printCharge() {
			this.calcCharge();
			System.out.println(user+" 사용자는 이번달에 사용하신 전화요금이"+this.getTotal()+"원 입니다.");
		}

}
 