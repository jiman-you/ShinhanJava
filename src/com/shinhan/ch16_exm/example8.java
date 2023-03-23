package com.shinhan.ch16_exm;

import java.util.Arrays;

public class example8 {

	static Student[] studentList = {
			new Student("김1",10,20),
			new Student("김2",10,20),
			new Student("김3",10,20),
			new Student("김4",10,20),
			new Student("김5",10,20)
	};
	
	public static void main(String[] args) {
		double engAvg = avg(s->s.getEngScore());
		double mathAvg = avg(s->s.getMathScore());
		System.out.println("영어평균:"+engAvg);
		System.out.println("수학평균:"+mathAvg);

		
		engAvg = Arrays.stream(studentList).mapToInt(s->s.getEngScore()).average().orElse(0);
	}
	

	private static double avg(Function2<Student> f) {
		double result =0;
		for(Student st : studentList) {
			double d = f.apply(st);
			result += d;	
		}
		return result/studentList.length;
	}

}
