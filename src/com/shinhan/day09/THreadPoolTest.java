package com.shinhan.day09;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class THreadPoolTest {
	public static void main(String[] args) {
		f2();
	}

	// Callable인터페이스 구현하여 thread사용...return있음
	private static void f2() {
		String[][] mails = new String[1000][3];
		for (int i = 0; i < mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품입고";
		}

		ExecutorService service = Executors.newFixedThreadPool(5);// 스레드 몇개를 가지는 스레드풀이다.

		for (int i = 0; i < 100; i++) {
			final int idx = i;
			Future<Integer> future = service.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int j = 0; j <= idx; j++) {
						sum += j;
					}
					return sum;
				}

			});
			int result;
			try {
				result = future.get();
				System.out.println("future.get():"+idx+"까지 합계는" + result);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		service.shutdown();
	}

	// Runnable인터페이스 구현하여 thread사용...return없음
	private static void f1() {
		String[][] mails = new String[1000][3];
		for (int i = 0; i < mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품입고";
		}

		ExecutorService service = Executors.newFixedThreadPool(5);// 스레드 몇개를 가지는 스레드풀이다.

		for (int i = 0; i < 1000; i++) {
			final int idx = i;
			service.execute(new Runnable() {// 런어블을 구현

				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "]" + from + "==>" + to + ":" + content);
				}
			});
		}
		service.shutdown();
	}
}
