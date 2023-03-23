package com.shinhan.day06;

public class Cup implements Colorable{
	String foreColor;
		String BackColor;
		int size;
		
		@Override
		public void setForeground(String color) {
			foreColor = color;
			System.out.println("Cup의 Foreground변경:"+color);
			System.out.println("--------------------------");
		}
	
		@Override
		public void setBackground(String color) {
			BackColor = color;
			System.out.println("Cup의 Backround변경:"+color);
			System.out.println("--------------------------");
			
		}
}

