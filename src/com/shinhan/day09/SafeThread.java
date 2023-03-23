package com.shinhan.day09;

public class SafeThread extends Thread {
	private boolean stop;// false가 디폴트

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("....실행중....");
	
			if(Thread.interrupted()) {break;
			}
		}
		
		System.out.println("리소스 정리");
		System.out.println("실행종료");
	}

	/*
	 * @Override public void run() { try { while(true){
	 * System.out.println("....실행중...."); Thread.sleep(1); } }catch
	 * (InterruptedException e) { e.printStackTrace(); }
	 * System.out.println("리소스 정리"); System.out.println("실행종료"); }
	 */

}
