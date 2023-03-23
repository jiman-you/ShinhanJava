package com.shinhan.day04;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
//	1. Employee 클래스는 다음과 같은 필드를 가집니다.
//
//	멤버변수 name : String : private
//	         title : String : private
//	         baseSalary : int : private
//	         totalSalary : int : private
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;

//2. Employee 클래스는 다음과 같은 생성자를 가집니다.
//public Employee(String name, String title, int baseSalary) {
// 3개의 매개변수를 차례대로 같은 이름의 멤버변수 값으로 초기화하는 문장 정의
//}
	public Employee(String name, String title, int baseSalary) {
		this.name = name + "님";
		this.title = title + "님";
		this.baseSalary = baseSalary;
	}

//3. Employee 클래스는 다음과 같은 메소드를 가집니다.
//3-1. public void getTotalSalary() 메소드 :  
//  title 이 “부장” 이면 totalSalary 는 baseSalary + baseSalary 의 25%로 계산
//  title 이 “과장” 이면 totalSalary 는 baseSalary + baseSalary 의 15%로 계산 
//나머지 totalSalary 는 baseSalary + baseSalary 의 5%로 계산
	public void getTotalSalary() {
		if (title.equals("부장님")) {
			totalSalary = (int) (baseSalary + baseSalary * 0.25);
		} else if (title == "과장님") {
			totalSalary = (int) (baseSalary + baseSalary * 0.15);
		} else {
			totalSalary = (int) (baseSalary + baseSalary * 0.05);
		}
	}

// 3-2. public void print() 메소드 : 
//EmployeeExam 클래스 실행 예의 결과대로 title, name, baseSalary, totalSalary 를 출력
	public void print() {
		getTotalSalary();
		System.out.println(title + " 직급의 " + name + "의 본봉은 " + baseSalary + "원이고 총급여는" + totalSalary + "입니다.");
	}

	@Override
	public int hashCode() {
		return Objects.hash(baseSalary, name, title, totalSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return baseSalary == other.baseSalary && Objects.equals(name, other.name) && Objects.equals(title, other.title)
				&& totalSalary == other.totalSalary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", title=" + title + ", baseSalary=" + baseSalary + ", totalSalary="
				+ totalSalary + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		int result = name.compareTo(emp.name);//*-1붙이면 디센딩 
		int result2=baseSalary - emp.baseSalary;
		if(result == 0 )return result2;//이름이 같다면 돈으로 비교
		if(result2==0) return title.compareTo(emp.title);//이름돈이 같다면 직급으로 비교
		
		return result;
	}

}
