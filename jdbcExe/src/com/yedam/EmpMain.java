package com.yedam;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	 EmpDAO dao = new EmpDAO();
	 Scanner scn = new Scanner(System.in);

	public void exe () { //static없으면 인스턴스 메소드

		while (true) {
			System.out.println("1)목록조회 2)단건조회 3)입력 4)급여변경 5)삭제 9)종료");
			int menu = scn.nextInt();

			if (menu == 5) {
				remove();

			} else if (menu == 4) { // 사원번호, 급여입력. updateEmp(int id, int sal)
				modify();

			} else if (menu == 3) {
				// 입력처리 => 사번, last_name, 이메일, 입사일자, 직무:
				add();

			} else if (menu == 2) {
				// 단건조회
				search();
			} else if (menu == 1) {
				// 목록조회
				list();
			} else if (menu == 9) {
				// 프로그램 종료
				break;
			}
		} // end of while()

		System.out.println("end of program.");

	}// end of main()

	// 목록조회
	public  void list() { // static메소드(정적메소드, 메인함수에서 쓸수있음) or 인스턴스 메소드
//		List<Map<String, Object>> result = dao.empList(); //반환유형 확인하기
//		for(Map<String,Object> map : result) {
//			System.out.println("사원번호: " + map.get("emp_id") + ", 이름 : " + map.get("first_name") + "-" + map.get("last_name"));
//		}

		List<EmpVO> list = dao.empVoList();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());
		}
	}

	// 단건조회
	public  void search() {
		System.out.println("조회사원번호 입력>> ");
		int id = scn.nextInt();
		// 사용자의 입력값을 받아서 처리

		EmpVO emp = dao.getEmp(id);
		if (emp == null) {
			System.out.println("조회된 정보가 없음!!");
			//continue;
		}
		; // 반환유형 : EmpVO타입
		System.out.println("결과 : " + emp);
	}

	// 입력
	public  void add() {
		System.out.println("사번입력>> ");
		int eid = scn.nextInt();
		scn.nextLine();
		System.out.println("이름>> ");
		String name = scn.nextLine();
		System.out.println("이메일>> ");
		String mail = scn.nextLine();
		System.out.println("입사일자>> ");
		String hDate = scn.nextLine();
		System.out.println("직무>> ");
		String job = scn.nextLine();

		EmpVO emp = new EmpVO();
		emp.setEmployeeId(eid);
		emp.setLastName(name);
		emp.setEmail(mail);
		emp.setHireDate(hDate);
		emp.setJobId(job);

		if (dao.addEmp(emp) > 0) {
			System.out.println("입력성공!!");
		} else {
			System.out.println("처리중 에러!!");
		}
		;
	}

	// 수정
	public  void modify() {
		System.out.println("사원번호 입력>>");
		int eid = scn.nextInt();
		System.out.println("변경 급여 입력>>");
		int sal = scn.nextInt();

		if (dao.updateEmp(eid, sal) > 0) {
			System.out.println("변경 성공!!");
		} else {
			System.out.println("처리중 에러!!");
		}
	}

	// 삭제
	public  void remove() {
		scn.nextLine();
		System.out.println("삭제할 사원번호 입력>>");
		int eid = Integer.parseInt(scn.nextLine());
		if (dao.deleteEmp(eid) > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("처리중 에러");
		}
	}

}// end of class
