package com.shinhan.javatest;

public class Prob1_1 {

		public static void main(String[] args) {
			String[] array={"황남기85점","조성호89점","한인성88점","독고정진77점"};
			printMaxScore(array);
		}	
		private static void printMaxScore(String[] array){
			int maxScore=0;
			String maxName="";
			for(String str:array) {
				
				char[] charr =str.toCharArray();
				String name = "";
				String score = "";
				for(int i=0; i<charr.length-1;i++) {
					if(Character.isDigit(charr[i])) {
						score+=charr[i];
					}else {
						name+=charr[i];
					}
					if(Integer.parseInt(score)>maxScore) {
						maxScore = Integer.parseInt(score);
						maxName = name;
					}
				
				}
			}
				
			
			System.out.println("최고점수는 "+maxName+"님 "+maxScore+"점 입니다");
			
			 
		}
	}
