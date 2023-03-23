package com.shinhan.javatest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prob1 {
	public static void main(String[] args) {
		String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};
		printMaxScore(array);
	}	
	private static void printMaxScore(String[] array){
		String maxId = "";
		int max=0;
		String result1=null;
		String result2=null;
		for( String arr: array) {
			if(arr.length()==6) {
				result1= arr.substring(3,5);
				result2=arr.substring(0, 3);
			}else if(arr.length()==7) {
				result1= arr.substring(4,6);
				result2=arr.substring(0, 4);
			}
			int number = 0;
			number = Integer.parseInt(result1);
			if(number>max) {
				max = number;
				maxId = result2;
			}
			
		}
		System.out.println("최고점수는 "+maxId+"님 "+max+"점 입니다");
		
		 
	}	
}