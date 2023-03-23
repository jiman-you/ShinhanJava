package com.shinhan.day03;

import java.util.Arrays;

public class LAB05 {

	public static void main(String[] args) {

		int[][] a = {{30,30,30,30},{40,40,40,40},{50,50,50,50}};
		int[][] b = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] c = new int[3][4];
		int[][] d = sub(a,b,c);
		prn(c);
		System.out.println("mmmm");
		prn(d);
		
	}

	
	public static int[][] sub(int[][] a, int[][] b, int[][] c){
		for(int i =0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		
		return c;
		
	}
	public static void prn(int[][] c) {
		for(int i =0; i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
			System.out.print(c[i][j]);
			System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void Lab1() {
//		주어진 일차원 배열의 내용을 오름차순으로 정렬하는 로직을 작성하시오
//		[배열의 내용]
//				3, 24, 1, 55, 17, 43, 5
		int[] arr = new int[] {3,24,1,55,17,43,5};
		
		for(int i = 0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
