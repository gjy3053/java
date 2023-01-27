package com.yedam.project;

import java.util.Scanner;

public class MainMethod {
	CustomerDAO cDao = new CustomerDAO();
	PostDAO pDao = new PostDAO();
	Scanner sc = new Scanner(System.in);

	public void exe() {
		while (true) {
			System.out.println("1.회원가입 | 2.로그인 | 3.나가기");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("회원가입을 시작합니다");
				System.out.println("아이디 입력>");
				String id = sc.nextLine();

				while (CustomerSearch(id) != null) {
					System.out.println("중복된 id가 있습니다. 다시 입력해주세요");
					System.out.println("아이디 입력>");
					id = sc.nextLine();
				}

				System.out.println("비밀번호 입력>");
				String pw = sc.nextLine();
				System.out.println("주소 입력>");
				String addr = sc.nextLine();
				while (!addr.contains("대구")) {
					System.out.println("대구 사람만 가입할 수 있습니다. 다시 입력하세요");
					System.out.println("주소 입력>");
					addr = sc.nextLine();
				}

				CustomerVO customer = new CustomerVO();
				customer.setCustomerId(id);
				customer.setCustomerPw(pw);
				customer.setCustomerAddr(addr);

				if (cDao.addCustomer(customer) > 0) {
					System.out.println(id + "님 회원가입을 축하합니다");
				} else {
					System.out.println("회원가입 중 오류 발생");
				}

			} else if (menu == 2) {
				System.out.println("로그인을 시작합니다.");
				System.out.println("아이디입력>");
				String id = sc.nextLine();
				System.out.println("비밀번호입력>");
				String pw = sc.nextLine();
				CustomerVO customer = cDao.getCustomer(id);
				if (customer.getCustomerPw().equals(pw)) {
					System.out.println("로그인 성공");
					System.out.println(id + "님 안녕하세요");
				} else {
					System.out.println("로그인 실패");
				}

			} else if (menu == 3) {
				System.out.println("종료합니다.");
				break;
			}
		} // end of while()

	}

	public CustomerVO CustomerSearch(String id) { // id 중복검사
		CustomerVO customer = cDao.getCustomer(id);
		return customer;
	}
}
