package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExe {
	public static void main(String[] args) {
		// jdbc 라이브러리가지고 오라클 데이터 CRUD작업하기
		// 1. ojdbc.jar라이브러리가 있어야함
		// 2. Connection 객체. db연결하고 쿼리실행 or 실행결과 통로
		Connection conn;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "insert into employees(employee_id, job_id, last_name, email, hire_date)" + "values(300, 'IT_PROG', '홍', 'HONG', sysdate)";
		
		sql = "update employees set first_name = '길동' where employee_id =300";

		// jdbc driver정상인지 확인.
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // oracle.jdbc파일 있는지 확인
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러.");
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 1521은 포트정보
		String user = "hr"; // hr계정 볼거다
		String pass = "hr"; // hr계정 비밀번호

		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공!!");
			stmt = conn.createStatement(); // 쿼리실행, 처리결과 객체
			int r = stmt.executeUpdate(sql); //executeUpdate : insert, update, delete
			rs = stmt.executeQuery("select * from employees order by employee_id"); // executeQuery : select

			while (rs.next()) { //rs.next() : 다음 값이 있으면 true, 없으면 false
				System.out.println("사원번호 : " + rs.getInt("employee_id") // getInt : employee_id를 int타입으로 가져오겠다
				 + ", 이름 : " + rs.getString("first_name")
				 + ", 이메일 : " + rs.getString("email")
				 + ", 급여 : " + rs.getInt("salary")); 
			}
			System.out.println("end of records");
		} catch (SQLException e) {
			System.out.println("처리실패!!");
			e.printStackTrace();
		}

	}
}
