package com.shinhan.ch8;

public class RectTriangle extends Shape {
	double width;
	double heigth;
	RectTriangle(double w, double h) {
		super(3);
		this.width = w;
		this.heigth = h;
		// TODO Auto-generated constructor stub
	}

	@Override
	double getArea(double width, double heigth) {
		// TODO Auto-generated method stub
		double area = (width*heigth)/2;
		return area;
	}

	@Override
	double getPerimeter(double width, double heigth) {
		// TODO Auto-generated method stub
		double perimeter = 2*Math.sqrt((width/2)*heigth)+width;
		return perimeter;
	}

}
