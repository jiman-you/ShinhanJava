package com.shinhan.day04;

public class App {

	public static void main(String[] args) {
		sum(1, 2);
		sum(1, 2, 3);
		sum(1, 2, 3, 2, 4, 1);
		sum(1, 2, 3, 1, 31, 5, 51);
	}

	// 메서드 Overloading: 메서드 이름은 같은데 매개변수 사양이 다르다.
	// 파라메터 자동형변환가능.
	static void sum(int...a){//배열 int[] a도 가능
		int total=0;
		for(int su:a) {
			total+=su;
		}
		if(total==0)
			return;//return은 함수를 중단하고 호출장소로 돌아감.
		System.out.println("가변길이 매개변수:"+total);
	}

	static void sum(int a, int b) {
		System.out.println("sum =" + (a + b));
	}

	static void sum(int a, int b, int c) {
		System.out.println("sum =" + (a + b + c));
	}

	private static void f1() {
		Caculator[] arr = new Caculator[4];
		arr[0] = new Caculator("red");
		arr[0].setModel("A모델");
		arr[1] = new Caculator("black");
		arr[2] = new Caculator("b모델", "black");
		arr[3] = new Caculator("C모델", "blue", 4020);

		for (Caculator ca : arr) {
			print(ca);
		}

	}

	private static void print(Caculator cal) {
		System.out.println(cal.getModel());
		System.out.println(cal.getColor());
		System.out.println(cal.getPrice());
		cal.powerOn();
		cal.powerOff();
	}

}
