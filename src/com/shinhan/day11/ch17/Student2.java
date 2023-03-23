package com.shinhan.day11.ch17;

public class Student2 implements Comparable<Student2>{
	private String name;
	private int score;
	private String gender;
	
	public Student2(String name, int score,String gender) {
		this.name=name;
		this.score=score;
		this.gender=gender;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student2 [name=").append(name).append(", score=").append(score).append(", gender=")
				.append(gender).append("]");
		return builder.toString();
	}


	@Override
	public int compareTo(Student2 obj) {
		int result = score-obj.score;
		if(result == 0 ) return obj.name.compareTo(name);
		return result;
	}

	

}
