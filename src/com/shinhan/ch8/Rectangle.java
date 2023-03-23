package com.shinhan.ch8;

public class Rectangle extends Shape
					implements Resizable{
	double width;
	double heigth;
	

	 Rectangle(double w,double h) {
		// TODO Auto-generated constructor stub
		super(4);
		this.width = w;
		this.heigth = h;
	}
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width*=s;
		heigth*=s;
	}

	@Override
	double getArea(double width, double heigth) {
		// TODO Auto-generated method stub
		double area = width*heigth;
		return area;
	}

	@Override
	double getPerimeter(double width, double heigth) {
		// TODO Auto-generated method stub
		double perimeter = 2*(width+heigth);
		return perimeter;
	}
	

}
