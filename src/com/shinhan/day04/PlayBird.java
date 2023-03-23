package com.shinhan.day04;


public class PlayBird {

	public static void main(String[] args) {
		Duck duck = new Duck("꽥꽥이", 2, 50);
		Sparrow sprrow = new Sparrow("잭잭이", 2, 5);

		duck.fly();
		duck.sing();
		duck.disPlay();

		sprrow.fly();
		sprrow.sing();
		sprrow.disPlay();

		//
		System.out.println(sprrow);
		System.out.println(duck.toString());
	}

}
