package com.shinhan.ch14_exm;

public class MusicRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0;i<3;i++) {
			System.out.println("음악재생");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	}}
