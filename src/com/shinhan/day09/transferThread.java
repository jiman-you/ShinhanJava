package com.shinhan.day09;

import lombok.AllArgsConstructor;

//@AllArgsConstructor
public class transferThread extends Thread {
	ShareArea share;

	public transferThread(ShareArea share) {
		this.share = share;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 12; i++) {
			share.transfer();
		}
	}

}
