package com.shinhan.ch9_exm;

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