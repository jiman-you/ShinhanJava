package com.shinhan.day07;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectTest5 {
	public static void main(String[] args) throws IOException {
		ResourceTest2();
	}

	private static void ResourceTest2() throws IOException {
		
		URL url = ObjectTest5.class.getResource("Computer.class");
		System.out.println(url.getPath());//클래스파일은 bin폴더에 있다

		URL url2 = ObjectTest5.class.getResource("imege.JFIF");
		System.out.println(url.getPath());//클래스파일은 bin폴더에 있다
		
		InputStream is  = ObjectTest5.class.getResourceAsStream("Computer.class");
		InputStreamReader ir = new InputStreamReader(is);
		int i;
		while((i = ir.read())!=-1) {
			System.out.print((char)i);
		}is.close();
	}

	private static void ResourceTest() throws IOException {
		FileReader fr = new FileReader("src/com/shinhan/day7/Computer.java");
		int i;
		while((i = fr.read())!=-1) {
			System.out.println((char)i);
		}
		fr.close();
	}

	private static void ReflectionTest() {
		Class cls = Computer.class;
		//Class cls2 = Class.forName("com.shinhan.day7.Computer");
		Computer com = new Computer();
		Class cls3 = Computer.class;
		
		Method[] ms = cls.getDeclaredMethods();
		for(Method m : ms) {
			System.out.println(m.getName());
			System.out.println(m.getParameterCount());
		}
		
		
		Field[] fs = cls.getDeclaredFields();
		System.out.println(fs.length);
		for(Field f: fs) {
			System.out.println(f.getName());
			System.out.println(f.getType());
		}
		
		
//		Constructor[] constructers = cls.getDeclaredConstructor();
//		for(Constructor con : constructers) {
//			System.out.println(con.getModifiers());
//		}
		
	}

	private static void RegularTest4() {
		String p1 = "([A-Za-z0-9]+)@(\\w+)\\.\\w+";//+한개이상은와야한다 \w한개의 알파벳 또는 숫자 () 그룹핑
		String data = "이메일1:wlaksii00@duam.net,이메일2:rkskek@naver.com,이메일3:akqktk@gmail.com";
		
		Pattern pattern = Pattern.compile(p1);//패턴을 컴파일해서 패턴을 뽑음
		Matcher matcher = pattern.matcher(data);//데이터에서 매칭되는 것을 찾음
		 while(matcher.find()) {//while문을 써서 찾은 데이터를 뽑음
			 System.out.println(matcher.group());
			 System.out.println(matcher.group(1));
			 System.out.println("------");
		 }
	}

	private static void RegularTest3() {
		String p1 = "010-([0-9]{3,4})-\\d{4}";//[] 중에 {} 갯수 \\쓴 이유는 한개는 제어어
		String data = "010-134-5678 이곳으로 연락바람 010-2342-2321 혹은 010-1663-2692";
		
		Pattern pattern = Pattern.compile(p1);//패턴을 컴파일해서 패턴을 뽑음
		Matcher matcher = pattern.matcher(data);//데이터에서 매칭되는 것을 찾음
		 while(matcher.find()) {//while문을 써서 찾은 데이터를 뽑음
			 System.out.println(matcher.group(1));
		 }
	}

	private static void RegularTest2() {
		String p1 = "[A-Za-z0-9]+@\\w+\\.\\w+";//+한개이상은와야한다 \w한개의 알파벳 또는 숫자
		String data = "wlaksii00@duam.net";
		
		boolean result = Pattern.matches(p1, data);
		System.out.println(result?"OK":"No");
		
		
	}

	private static void RegularTest() {
		String p1 = "010-[0-9]{3,4}-\\d{4}";//[] 중에 {} 갯수 \\쓴 이유는 한개는 제어어
		String data = "010-134-5678";
		
		boolean result = Pattern.matches(p1, data);
		System.out.println(result?"OK":"No");
	}
}
