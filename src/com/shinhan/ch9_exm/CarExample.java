package com.shinhan.ch9_exm;

import com.shinhan.ch9_exm.Car.Tire;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		Car.Tire tire = new Car().new Tire();
		tire.method1();
		Car.Engine engine = new Car.Engine();
		engine.method2();
	}

}
