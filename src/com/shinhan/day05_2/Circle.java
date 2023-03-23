package com.shinhan.day05_2;

public class Circle extends Shape{
	double radius;
	double circumference;
	
	Circle(String color, double radius){
		super(color,"Circle");
		this.radius = radius;
	}
	@Override
	public double calculateArea() {

		return 2*radius*Math.PI;
	}
	@Override
	public double calculatePerimeter() {
		circumference = 2*radius*Math.PI;
		return circumference;
	}
	public double getradius() {
		return radius;
	}
}
