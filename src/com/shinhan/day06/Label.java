package com.shinhan.day06;

public class Label implements Changeable{
	int width,height;
	String Color;
	String font;
	String text;

	public Label(int width, int height, String color, String font, String text) {
		super();
		this.width = width;
		this.height = height;
		Color = color;
		this.font = font;
		this.text = text;
	}

	@Override
	public void size(int width, int heigt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setForeground(String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBackground(String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFont(String font) {
		// TODO Auto-generated method stub
		
	}

}
