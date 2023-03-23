package com.shinhan.ch9_exm;

import com.shinhan.ch9_exm.Car.Tire;
import com.shinhan.ch9_exm.Chatting.Chat;
public class 유지만9장 {
//------4번
	

	public class CarExample {

		public static void main(String[] args) {
			Car myCar = new Car();
			Car.Tire tire = new Car().new Tire();
			tire.method1();
			Car.Engine engine = new Car.Engine();
			engine.method2();
		}

	}
	public class Car {
		class Tire{
			public void method1() {
				System.out.println("타이어");
			}
		}
		static class Engine{
			void method2() {
				System.out.println("엔진");
			}
		}
	}
	//-----5번
	public class ActionExample {
		public static void main(String[] args) {
			Action action = new Action() {
				
				@Override
				public void work() {
					System.out.println("복사를 합니다");
					
				}
			};
			action.work();
		}
	}
	//------6번
	public class Anonymous {
		Vehicle field = new Vehicle() {//필드 익명구현객체
			@Override
			public void run() {
				System.out.println("자전거가 달립니다.");
			}
		};
		void method1() {
			Vehicle localVar = new Vehicle() {//로컬 익명구현객체
				
				@Override
				public void run() {
					System.out.println("승용차가 달립니다.");
				}
			};
			localVar.run();
		}
		void method2(Vehicle v) {
			v.run();
		}
	}
	public class AnonynousExample {
		public static void main(String[] args) {
			Anonymous anony = new Anonymous();
			anony.field.run();
			anony.method1();
			anony.method2(new Vehicle() {
				
				@Override
				public void run() {
					System.out.println("트럭이 달립니다.");
				}
			});
		}
	}
//-----7번
	public class Chatting{
		class Chat{
			void start() {}
			void sendMessage(String message) {}
		}

	//로컬변수를 로컬클래스 내부에서 사용할시 final특성을 가진다.
	//따라서 String nickName =null; -> nickName = chatId; 로의 변경이 불가하다
	//이와 같은 경우에는 한번에 선언을 완료해주어야한다.
		void startChat(String chatId) {
		String nickName = chatId;
		//nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+nickName+"]"+inputData;
					sendMessage(message);
				}
			}
		};
			chat.start();
		}
	}

