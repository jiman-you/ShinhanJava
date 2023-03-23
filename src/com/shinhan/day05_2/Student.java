package com.shinhan.day05_2;

//접근권한: public, protected, 생략, private
//활용방법: static, final
public class Student extends Object{

	//1.field(데이터 저장하기위한 변수들):instance 변수, static 변수
	private String stdid;//private: 이 calss내에서만 사용가능
	public String name;  //public: 모든 패키지에서 사용가능
	String major;		 // 생략:같은 패키지에서 사용가능
	protected int score;;//protected:같은 패키지에서 접근가능, 다른 패키지면 자식은 접근가능
	public final String schoolName= "신한금융대학"; //final: 초기화가 1회(선언, 생성시)
	static final String NATION = "대한민국";//static final: 상수,class 변수,초기화가 1회(선언시)
	static int count;//class변수 
	
	
	public Student(String stdId,String name) {
		//defalut 생성자는 컴파일시에 자동으로 class에 추가. 재정의하면 생성이 안됨.
		this(stdId,name,null,0);
	}
	public Student(String stdId,String name,String major) {
		//defalut 생성자는 컴파일시에 자동으로 class에 추가. 재정의하면 생성이 안됨.
		this(stdId,name,major,0);
	}
	public Student(String stdid, String name, String major, int score) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.major = major;
		this.score = score;
		count++;
	}
	public String getStdid() {
		return stdid;
	}
	public void setStdid(String stdid) {
		this.stdid = stdid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public static String getNation() {
		return NATION;
	}
	@Override
	public String toString() {
		return "Student정보 [stdid=" + stdid + ", name=" + name + ", major=" + major + ", score=" + score + ", schoolName="
				+ schoolName + "]";
	}
	
}
