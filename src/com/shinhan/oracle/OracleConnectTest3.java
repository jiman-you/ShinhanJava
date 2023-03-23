package com.shinhan.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleConnectTest3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("조회하고자하는 지구언이름입력>>");
		Scanner sc = new Scanner(System.in);
		String inputName=sc.nextLine();
		
		String sql="select first_name, last_name, salary, hire_date"
				+" from employees "
				+" where lower(first_name) = lower('"
				+inputName 
				+"') ";
		//1.driver load
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1.driver load성공");
		//2.Connection
		//String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String url="jdbc:mysql://localhost/hr";
		String userid="hr", pass="hr";
		Connection  conn = DriverManager.getConnection(url, userid, pass);
		System.out.println("2.Connection성공");
		//3.Statement를 통해서 SQL전송
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {

			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getDate(4));
			System.out.println("----------------------");
		}
		rs.close();st.close();conn.close();//자원반납
}
}
























