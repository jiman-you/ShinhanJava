package com.shinhan.day06;

public class Book implements Colorable{
	String foreColor;
	String BackColor;
	String title;
	
	@Override
	public void setForeground(String color) {
		foreColor = color;
		System.out.println("Book의 Foreground변경:"+color);
		System.out.println("--------------------------");
	}

	@Override
	public void setBackground(String color) {
		BackColor = color;
		System.out.println("Book의 Backround변경:"+color);
		System.out.println("--------------------------");
		
	}

}
