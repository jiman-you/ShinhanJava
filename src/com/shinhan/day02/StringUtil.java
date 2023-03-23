package com.shinhan.day02;

public class StringUtil {
	public static void hokeyGraphics(char cell, int size, boolean isRect)
    {	
        //특정 도형을 출력하는 메소드 구현
    	if(isRect) {
    		for(int row=1;row<=size;row++) {
    			for(int cal=1;cal<=size;cal++) {
    				System.out.println(cell);
    			}
    			System.out.println();
    		}
    	}else{
    		for(int row=1;row<=size;row++) {
    			for(int cal=1;cal<=row;cal++) {
    				System.out.print(cell);
    				
    			}
    			System.out.println();
    		
    	
    	}
    	}
    }

	public static void main(String args[]) {
		hokeyGraphics('$', 4, false);
	}
}
