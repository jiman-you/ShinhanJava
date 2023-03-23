package com.shinhan.day03;

import java.util.Arrays;

//cmd>java 패키지/클래스이름 100,200=>명령행 매개변수
public class ArrayTest {

	public static void main(String[] args) {
		if(args.length < 2) {
			//main빠지기 
			//return;
			//프로그램 강제종료
			System.exit(0);//0정상종료 -1비정상종료
		}
		
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		
		System.out.println(a+b);
		

	}

	private static void f6() {
		int[] arr1 = new int[] {100,90,30,40};
		int[] arr2 = new int[10];
		for(int i = 0; i<arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		//arraycopy(원본배열,원본배열 시작, 새 배열, 새배열 시작, 복사항목수)
		System.arraycopy(arr1, 0, arr2,4 , arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	private static void f5() {
		//선언+생성...자동초기화
		int arr[] = new int[5];
		//선언+생성+초기화...길이는 생략해야한다.
		int[] arr2 =new int[] {13,2,4,55,2};
		int[] arr3 ={13,2,4,55,2};//선언+생성+초기화시  new생략가능
		int[] arr4;
		arr4 = new int[] {132,24,255,312,3};//선언과 초기화를 따로하면 new사용
		
		int[][] arr5 =new int[][] {{13,2,4,55,2},{132,24,255,312,3}};
		int[][] arr6;
		arr6 = new int[][] {{1,2,4},{34,2,5,3}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));

		for(int[] aa:arr5) {
			System.out.println(Arrays.toString(aa));
			
		}
	}

	private static void f1() {
		// 배열 : 하나의 이름으로 같은 타입의 heap영역에 연속공간을 만드는 자료구조
		// 1. 배열변수 선언
		int arr1[] = null;
		int[] arr2 = null;
		double[] arr3;
		boolean[] arr4;
		String[] arr5;
		// 2. 배열생성..배열의 개수는 필수로 선언해줘야한다. 생성시 자동 초기화.
		// 정수(0) 실수(0.0) boolean(false) 객체(null)
		arr1 = new int[4];
		arr3 = new double[6];
		arr4 = new boolean[3];
		arr5 = new String[4];
		// 3. 배열사용
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr5));

	}

	private static void f2() {
		int[] scores;
		scores = new int[26];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		
		int total = 0;
		int count =0;
		int avg = 0;
		
		for(int i=0;i<scores.length;i++) {
			if(scores[i]!= 0 ) {
				total += scores[i];
				count++;
			}
		}
		avg = total/count;
		System.out.println(avg);
		
		//확장for: for(타입 변수:배열) (하나 작은거:큰거)
		for(int score:scores) {
			total+= score;
		}
		System.out.println(total);
	}

	private static void f3() {
		//2차원 배열 : 배열의 배열
		//1.배열변수선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		//2.배열생성... 배열길이 필수
		arr1 = new int[3][4];
		arr2 = new int[3][];//오류는 안나지만 길이 지정해줘야댐
		//arr3 = new int [][]; //아무것도 모르는거 불가 
		
		//3.배열사용
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0]);
		
		for(int i = 0; i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.printf("%d행 %d열 = %d\n",i,j,arr1[i][j]);
			}
		}
		for(int[] aa:arr1) {
			for(int a:aa) {
				System.out.print(a);
			}
			System.out.println();
		}
	}

	private static void f4() {
		int[] arr2[];
		arr2 = new int[3][];
		arr2[0] = new int[4];
		arr2[1] = new int[2];
		arr2[2] = new int[3];
		
		for(int i = 0; i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
	}

}
