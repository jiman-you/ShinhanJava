package com.shinhan.javatest;

public class Prob2 {

	public static void main(String[] args) {
		System.out.println(leftPad("Samsung",10,'#'));
		System.out.println(leftPad("SDS",5,'*'));
		System.out.println(leftPad("Multicampus",5,'@'));
		
	}

	 

	public static String leftPad(String str, int size, char fillChar) {
		//구현하시오.....return값 수정할것 
		String cha = String.valueOf(fillChar);
		String num = "%"+size+"s";
		try {
		if(size<str.length()) {
			throw new IllegalSizeException("문자열의 길이가 Size보다 큽니다");
		}
		}catch(IllegalSizeException e) {System.out.println(e.getMessage());};
		String newStr = String.format(num, str).replace(" ",cha);
				
//		System.out.println(newStr);
		return newStr;
	}

	
	
}

//구현하시오.
class IllegalSizeException  extends Exception{
	 public IllegalSizeException() {
		 
	 }
	 public IllegalSizeException(String message) {
		super(message);
	 }
	 
}



