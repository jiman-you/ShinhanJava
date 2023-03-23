package com.shinhan.day03;

import java.util.Scanner;

public class 유지만 {

	public static void main(String[] args) {
		m4_20();

	}

	private static void m3_1() {
		// 4.참조타입은 null값으로 초기화 할 수 없다.

	}

	private static void m3_2() {
		// 3.참조되지 않는 개체는 프로그램에서 직접 소멸 코드를 작성하는 것이 좋다.

	}

	private static void m3_3() {
		// 2.String타입의 문자열 비교는 ==을 사용해야한다 -- equals사용
	}

	private static void m3_4() {
		// 2.int[] array;array = {1,2,3};
	}

	private static void m3_5() {
		// 3.boolean타입 배열 항목의 기본 초기값은 true이다.
	}

	private static void m3_6() {// 3.5
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		System.out.println(array.length);
		System.out.println(array[2].length);
	}

	private static void m3_7() {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);

	}

	private static void m3_8() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int total = 0, avg = 0, count = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
				count++;
			}
		}
		avg = total / count;

		System.out.printf("합:%d\n평균:%d", total, avg);
	}

	private static void m3_9() {
		Scanner scn = new Scanner(System.in);
		int people = 0, total = 0, avg = 0;
		int[] scores = new int[10];

		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.학생수:2.점수입력:3.점수리스트:4.분석:5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			int num = scn.nextInt();

			switch (num) {
			case 1:
				System.out.println("선택>1");
				System.out.print("학생수>");
				int stnum = scn.nextInt();
				people = stnum;
				continue;
			case 2:
				System.out.println("선택>2");
				System.out.print("점수입력>");
				for (int i = 0; i < people; i++) {
					System.out.printf("scores[%d]>", i);
					int score = scn.nextInt();
					scores[i] = score;
				}
				continue;
			case 3:
				System.out.println("선택>3");
				System.out.print("점수리스트>\n");
				for (int i = 0; i < people; i++) {
					System.out.printf("scores[%d]:%d", i, scores[i]);

				}
				continue;
			case 4:
				System.out.println("선택>4");
				System.out.print("분석>\n");
				for (int i = 0; i < people; i++) {
					total += scores[i];
				}
				avg = total / scores.length;
				System.out.print("최고점수:" + total);
				System.out.print("평균점수:" + avg);
				continue;
			case 5:
				System.out.println("선택>5");
				System.out.println();
				System.out.println("프로그램 종료");
				break;

			}
			break;
		}
	}

	private static void m4_1() {
		// TODO Auto-generated method stub

	}

	private static void m4_2() {
		// TODO Auto-generated method stub

	}

	private static void m4_3() {
		// TODO Auto-generated method stub

	}

	private static void m4_4() {
		// TODO Auto-generated method stub

	}

	private static void m4_5() {
		// TODO Auto-generated method stub

	}

	private static void m4_6() {
		// TODO Auto-generated method stub

	}

	private static void m4_7() {
		// TODO Auto-generated method stub

	}

	private static void m4_8() {
		// TODO Auto-generated method stub

	}

	private static void m4_9() {
		// TODO Auto-generated method stub

	}

	private static void m4_10() {
		// TODO Auto-generated method stub

	}

	private static void m4_11() {
		// TODO Auto-generated method stub

	}

	private static void m4_12() {
		// TODO Auto-generat2ed method stub

	}

	private static void m4_13() {
		class Member {
			private String Name;
			private String Id;
			private String Password;
			private int age;
		}

	}

	private static void m4_14() {
		class Member {
			private String Name;
			private String Id;
			private String Password;
			private int age;

			Member(String name, String id) {
				this.Name = name;
				this.Id = id;
			}
		}

	}

	private static void m4_15() {
		class MemberService {
			private String Id;
			private String Password;

			MemberService(String id, String pass) {
				this.Id = id;
				this.Password = pass;
			}

			public boolean login(String id, String pass) {
				if (id == "hong" && pass == "12345")
					return true;
				else
					return false;
			}

			void logout(String id) {
				System.out.println(id + "님이 로그아웃");
			}

		}

	}

	private static void m4_16() {
		class Printer {
			int num;
			boolean bool;
			double sil;
			String str;

			void println(int num) {

			}

			void println(boolean bool) {

			}

			void println(double sil) {

			}

			void println(String str) {

			}

		}

	}

	private static void m4_17() {
		class Printer {
			int num;
			boolean bool;
			double sil;
			String str;

			static void println(int num) {

			}

			static void println(boolean bool) {

			}

			static void println(double sil) {

			}

			static void println(String str) {

			}
		}
	}

	private static void m4_18() {
		class ShopService {
			private static ShopService shop = new ShopService();

			private ShopService() {

			}

			public static ShopService getinstance() {
				return shop;
			}
		}
	}

	private static void m4_19() {
		class Account {
			private int balance;
			final static int MIN_BALANCE = 0;
			final static int MAX_BALANCE = 1000000;

			public int getBalance() {
				return balance;
			}

			public void setBalance(int balance) {
				int total = this.balance + balance;

				if (total >= MIN_BALANCE && total <= MAX_BALANCE) {
					this.balance = total;
				} else {
					System.out.println("0원에서 1000000사이의 돈을 입금해주세요");
				}

			}

		}
		Account ac = new Account();

		ac.setBalance(10000);
		System.out.println("현재잔고:" + ac.getBalance());

		ac.setBalance(-11000);
		System.out.println("현재잔고:" + ac.getBalance());
	}

	private static void m4_20() {
		class Account {
			String id;
			String name;
			int money;

			Account(String id, String name, int money) {
				this.id = id;
				this.name = name;
				this.money = money;
				
			}
		void call(){
				System.out.println(id
						+ "        "
						+ name
						+ "        "
						+ money);
			}

		}

		Scanner scn = new Scanner(System.in);
		int people = 0;
		Account[] acc = new Account[100];

		while (true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.계좌생성:2.계좌목록:3.예금:4.출금:5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택>");
			int num = scn.nextInt();

			switch (num) {
			case 1:
				System.out.println("ㅡㅡㅡㅡ");
				System.out.println("계좌생성");
				System.out.println("ㅡㅡㅡㅡ");
				
				Scanner sc = new Scanner(System.in);
				System.out.print("계좌번호:");
				String id = sc.nextLine();
				System.out.println();

				System.out.print("계좌주:");
				String name = sc.nextLine();
				System.out.println();

				System.out.print("초기입금액:");
				int money = scn.nextInt();
				System.out.println();

				acc[people] = new Account(id, name, money);
				System.out.println("결과:계좌가 생성되었습니다.");
				people++;

				continue;
			case 2:
				System.out.println("ㅡㅡㅡㅡ");
				System.out.println("계좌목록");
				System.out.println("ㅡㅡㅡㅡ");
				
				for(int i=0;i<=people;i++) {
					acc[i].call();
				}
				continue;
			case 3:
				System.out.println("ㅡㅡㅡㅡ");
				System.out.println("예금");
				System.out.println("ㅡㅡㅡㅡ");
				
				
				continue;
//			case 4:
//				System.out.println("선택>4");
//				System.out.print("분석>\n");
//				for (int i = 0; i < people; i++) {
//					total += scores[i];
//				}
//				avg = total / scores.length;
//				System.out.print("최고점수:" + total);
//				System.out.print("평균점수:" + avg);
//				continue;
//			case 5:
//				System.out.println("선택>5");
//				System.out.println();
//				System.out.println("프로그램 종료");
//				break;

			}
			break;
		}

	}

}
