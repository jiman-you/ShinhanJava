package com.shinhan.Ch11;

public class CellPhone {
	String model;	// 핸드폰 모델 번호
	double battery;	// 남은 배터리 양

	CellPhone(String model){
		this.model = model;
	}
	void  call(int time) {
		//강제Exception발생 처리는 안함 , RuntiomeException에 속한 Excepron은 자동으로 throws(던져준다)
		if(time<0) throw new IllegalArgumentException("통화시간오류");
		battery -= time*0.5;
		if(battery <0) battery = 0;
		System.out.println("통화시간:"+time+"분");
	}
	void  charge(int time) {
		if(time<0) throw new IllegalArgumentException("통화시간오류");
		battery += time*3;
		if(battery >100) battery = 100;
		System.out.println("충전시간:"+time+"분");
	}
	void  printBattery() {
		System.out.println("남은 배터리양:"+battery);
	}
	//overoading: 매개타입과 갯수가 다르면 오버로딩
	//override : 이름, 매개타입과 갯수 , 리턴타입이 모두 같아야하고 리턴타입이 같거나 넓어져야한
	public boolean  equals(Object otherObject) {
		CellPhone p = (CellPhone)otherObject;
		return this.model.equals(otherObject);
	}

}
