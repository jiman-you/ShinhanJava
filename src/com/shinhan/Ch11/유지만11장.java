package com.shinhan.Ch11;

import java.io.FileWriter;
import java.io.IOException;

public class 유지만11장 {
	//----5번
	public class exm5 {

		public static void main(String[] args) {
			
		}

			public void method1() throws NumberFormatException,ClassNotFoundException{
				try {
					method1();
				}catch(Exception e) {
					
				}
				
				try {
					method1();
				}catch(Exception e) {
					
				}catch(ClassNotFoundException e) {
					
				}
				
				try {
					method1();
				}catch(ClassNotFoundException e) {
					
				}catch(NumberFormatException e) {
					
				}
			}
			void method2() throws Exception {
				method1();
			}
	}
//----6번
	public class exm6 {

		public static void main(String[] args) {
			String[] strArray = {"10","2a"};
			int value = 0;
			for(int i=0; i<=2;i++) {
				try {
					value = Integer.parseInt(strArray[i]);
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("인덱스를 초과햇음");
					e.printStackTrace();
				}catch(NumberFormatException e) {
					System.out.println("숫자로 변환할 수 없음");
					e.printStackTrace();
				}finally {
					System.out.println(value);
				}
			}
		}

	}
	//-----7번
	public class NotExistIDException extends Exception{
		public NotExistIDException() {}
		public NotExistIDException(String message) {
			super(message);
		}
		
	}
	public class WrongPasswordException extends Exception{
		public WrongPasswordException() {}
		public WrongPasswordException(String message) {
			super(message);
			}
		
	}
	public class LoginExample {

		public static void main(String[] args) {
			try {
				login("white","12345");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				login("blue","54321");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		public static void login(String id,String password) throws NotExistIDException, WrongPasswordException {
			if(!id.equals("blue")) {
				throw new NotExistIDException("아이디가 존재하지않습니다.");
			}
			if(!password.equals("12345")) {
				throw new WrongPasswordException("패스워드가 틀립니다.");
					
			}
		}
	}
//------8번
	public class FileWriterExample {
		public static void main(String[] args) {
			FileWriter fw = null;
			try {
				fw = new FileWriter("file.txt");
				fw.write("java");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
