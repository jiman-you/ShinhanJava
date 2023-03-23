package com.shinhan.day06;

public class ExceptionTest2 {

	public static void main(String[] args) {
		//Exception:자동발생, 강제발생            throw(예약어)강제로일어나다발생하다
//		int a=10/0;//자동발생
		String pass = "123456";
		
		char ch = pass.charAt(0);
		try {
		if(ch<'A'||ch>'Z') {
			throw new LoginException("대문자 시작해야한다");
			
			}
		}catch(LoginException ex) {
			System.out.println(ex.getMessage());
			ex.PrintMessage();
		}
		System.out.println("main end");
	}

}
