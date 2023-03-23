package com.shinhan.day08;

public class Course {

	public static void registerCourse1(Applicant<?> applican) {//누구나 등록가능
		System.out.println(applican.kind.getClass().getSimpleName()+"이가 등록한 과정임");
	}
	public static void registerCourse2(Applicant<? extends Student> applican) {//스투던트 자식 등록가능
		System.out.println(applican.kind.getClass().getSimpleName()+"이가 코스2등록");
	}
	public static void registerCourse3(Applicant<? super Worker> applican) {//본인  등록가능
		System.out.println(applican.kind.getClass().getSimpleName()+"이가 코스3등록");
	}
	
}
