package com.shinhan.Ch11;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;

//Rcvrption(예외):프로그래머래
public class ExemptionTest {

	public static void main(String[] args) throws IOException{
		System.out.println("gogo");
		try {
			f6();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bye");
	}
	
	private static void f6() throws ClassNotFoundException {
		Class cls = Class.forName("com.shinhan.day06.Book");
		System.out.println(cls.getSimpleName());
	}

	private static void f5() throws IOException {
		// 일반 Exeption - 컴파일 시점에 반드시 해결해야한다.
		// 2.떠넘긴다.-이 함수를 호출한 곳에 떠넘긴다.
		FileReader fr = new FileReader("src/com/shinhan/day06/Book.java");

		int i;
		while((i =fr.read())!=-1) {
			System.out.print((char)i);
		}
	}

	private static void f4() {
		// 일반 Exeption - 컴파일 시점에 반드시 해결해야한다.
		// 1.내가한다 2.떠넘긴다.
		 //(try(){}:try종료후 자원 자동반납
		try(FileReader fr = new FileReader("src/com/shinhan/day06/Book.java")) {	
			System.out.println("파일존재...파일열림");
			
			int i;
			while((i =fr.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void f3() {
		// 일반 Exeption - 컴파일 시점에 반드시 해결해야한다.
		// 1.내가한다 2.떠넘긴다.
		FileReader fr = null;
		try {
			fr = new FileReader("src/com/shinhan/day06/Book.java");
			System.out.println("파일존재...파일열림");
			
			int i;
			while((i =fr.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	private static void f2() {
		try {
			
			int a = 10;
			int b= 0;
			System.out.println(a/b);
			System.out.println("여기는안옴");
			
			String s2 = null;
			System.out.println(s2.length());
			
		}catch(ArithmeticException ex|ArrayIndexOutOfBoundsException ex) {// |or 이용가능
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
		}catch(Exception ex) {//catch는 하위 먼저 상위 나중에 작성한다.
			//ex.printStackTrace();
			System.out.println(ex.getMessage());
		
	}finally {
		System.out.println(" 이 부분은 반드시 처리... 자원반납코드를쓴다. dbidconnect,fileclose");
		}
	}

	private static void f1() {
		// 실행예외 : 컴파일시에 오류없음, 실행시 오류
		// 기타예외 : 컴파일시에 반드시 처리해야한다.
		// 1.arithmeticException
		int a = 10;
		int b = 0;
		// System.out.println(a/b);
		int[] arr = new int[5];

		Object obj = new Object();
		System.out.println(obj.toString());
		String su = "100점";
		int total;
	}

}
