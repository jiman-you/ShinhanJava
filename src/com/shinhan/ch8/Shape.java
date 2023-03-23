package com.shinhan.ch8;

public abstract class Shape {
	private int numSides;
	
	Shape(int numSides){
		this.numSides = numSides;
	}
	int getNumSides(){
		return numSides;
	}
	abstract double getArea(double width, double heigth);
	abstract double getPerimeter(double width,double heigth);
}
