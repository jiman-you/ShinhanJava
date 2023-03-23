package com.shinhan.day07;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Set;

//명령행 매개변수 > java Object3 100, 200 
public class ObjectTest3 {
	public static void main(String[] args) {
		
			f5();
			
		System.out.println("main end----");
	}
	private static void f5() {
		
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		Properties ps=System.getProperties();
		Set<Object> Keys = ps.keySet();
		for(Object key:Keys) {
			System.out.println(key+"------"+System.getProperty((String)key));
		}
	}
	private static void f4() {
//		long startTime = System.currentTimeMillis();
		long startTime = System.nanoTime();
		for(int i=0;i<10000000;i++) {
			
		}
		System.out.println();
		
	}
	private static void f3(String[] arr) {
		//1.함수빠지기
//		return;
//		2.v프로그램 당장종료 Sysotem.exit(0);
		if(arr.length==0) {
			System.out.println("명령행 매개변수가 없다");
			return;
		}
		
	}

	private static void f2() throws IOException {
		// 3.in: 표준입력(default-키보드)

		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		int i;
		while((i = ir.read())!=13) {
			System.out.println((char)i);
		}
		
	}

	private static void f1() {
		// System class
		// 1.out:표준출력(모니터 출력)
		// 2.err
		PrintStream ps = System.out;
		ps.print(false);
		ps.printf("%10d", 100);// 10칸의 자리를 줌
		ps.printf("%-10d", 100);// 왼쪽정렬
		ps.println("자바");
		ps.println("-------");
	}
}
