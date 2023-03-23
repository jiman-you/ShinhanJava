package com.shinhan.ch13;

public class UtilExample {
	public static void main(String[] args) {
		pair<String, Integer> pair = new pair<>("홍길동",35);
		Integer age = Util.getvalue(pair,"홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<String, Integer>("홍삼원", 20);
		Integer childAge = Util.getvalue(childPair,"홍삼순");
		System.out.println(childAge);
	}
}
