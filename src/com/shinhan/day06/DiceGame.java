package com.shinhan.day06;

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;//random = 0~1사이의 실수
		return number;
	}
}

public class DiceGame {
	public static void main(String args[]) {
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

	}

	int countSameEye(int n)  {
		if(n<0) throw new IllegalArgumentException("던지는 횟수는 음수불가");
		
		int count =0;
		for(int i=0;i<=n;i++) {
				Dice d1 = new Dice(8);
				Dice d2 = new Dice(8);
				System.out.println(d1.play()+"---"+d2.play());
				if(d1.play() == d2.play()) {
					count ++;
				}
		}
	
		return count;
	}
}
