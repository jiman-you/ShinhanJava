package com.shinhan.ch14_exm;

public class MovieThread extends Thread{

	@Override
	public void run() {
		for(int i = 0;i<3;i++) {
			System.out.println("영화재생");
			if(this.isInterrupted()) {//isInterrupted는 true를 리턴한다.
				break;
			}
		}
	}
	
}
