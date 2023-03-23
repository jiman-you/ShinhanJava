package com.shinhan.day05_2;

public class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(String color,double length, double width) {
		super(color,"Rectangle");
		this.length = length;
		this.width = width;
	}
	@Override
	public double calculateArea() {
	
		return length*width;
	}
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+length);
	}
	
	
	
}
