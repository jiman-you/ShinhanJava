package com.shinhan.ch8;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] sh = new Shape[2];
		
		sh[0]= new Rectangle(5, 6);
		sh[1] = new RectTriangle(6, 2);
		
		for(Shape s:sh) {
			if(s instanceof Rectangle sq) {
				System.out.println("사각형");
				System.out.println("area:"+sq.getArea(sq.width, sq.heigth));
				System.out.println("perimeter:"+sq.getPerimeter(sq.width, sq.heigth));
				sq.resize(0.5);
				System.out.println("new area:"+sq.getArea(sq.width, sq.heigth));
				System.out.println("perimeter:"+sq.getPerimeter(sq.width, sq.heigth));
			
			}else if(s instanceof RectTriangle tri) {
				System.out.println("삼각형");
				System.out.println("area"+tri.getArea(tri.width,tri.heigth));
				System.out.println("perimeter"+tri.getPerimeter(tri.width,tri.heigth));
			}
		}
		
	}

}
