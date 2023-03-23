package com.shinhan.day03;import javax.security.auth.login.LoginContext;

public class EnumTest {
	//상수: 고정값 final= 마지막 static= 스택영역에 올림
	final static double PI = 3.141592;
	final static int MONDAY = 1;
	final static int SONDAY = 2;
	final static int SUCCESS = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f3();
	}

	private static String f4(Week week) {
		String result = null;
		if(week == Week.MONDAY) {
			result = "월요일";
		}
		return result;
	}

	private static void f3() {
		Week[] weeks = Week.values();
		for(Week week : weeks) {
			System.out.println(week.ordinal()+"==>"+week.name());
			String weekName = f5(week);
			System.out.println(weekName);
			System.out.println("---");
		}
	}

	private static String f5(Week week) {
		String result =null;
		switch(week) {
		case MONDAY: 
			result = "월요일";
			break;
		case TUESDAY: 
			result = "화요일";
			break;
		case WEDNESDAY: 
			result = "수요일";
			break;
		case THURSDAY: 
			result = "목요일";
			break;
		case FRIDAY: 
			result = "금요일";
			break;
		case SATURDAY: 
			result = "토요일";
			break;
		case SUNDAY: 
			result = "일요일";
			break;
			}
		
		return result;
	}

	private static void f2(LiginEnum login) {
		System.out.println(login == LiginEnum.SUCCESS );
		System.out.println(login == LiginEnum.FAIL );
		
		LiginEnum[] arr = LiginEnum.values();
		for(LiginEnum aa:arr) {
			System.out.println(aa.ordinal()+ "==" + aa.name());
		}
	}

	private static void f1() {
		System.out.println(PI);
		
	}

}
