package com.yedam.project;

import java.util.List;
import java.util.Scanner;

public class MainMethod {
	CustomerDAO cDao = new CustomerDAO();
	PostDAO pDao = new PostDAO();
	Scanner sc = new Scanner(System.in);
	static String id = "";

	public void exe() {
		System.out.println("┍—————— /ᐠ｡ꞈ｡ᐟ\\  ——————┑");
		System.out.println("|　 　대구 정보 게시판     |");
		System.out.println("┕————(..)(..) ∫∫————-┙");
		while (true) {
			System.out.println("1.회원가입 | 2.로그인 | 99.나가기");
			int menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				signUp();
			} else if (menu == 2) {
				login();
			} else if (menu == 99) {
				System.out.println("종료합니다.");
				break;
			}
		}

	}

	// id 중복검사
	public CustomerVO CustomerSearch(String id) {
		CustomerVO customer = cDao.getCustomer(id);
		return customer;
	}

	// 회원가입
	public void signUp() {
		System.out.println("♥　♡　♥　♡　♥　♡　♥ 회원가입 페이지 ♥　♡　♥　♡　♥　♡　♥");
		System.out.println("아이디 입력>");
		id = sc.nextLine();

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
			System.out.println("⋆ ˚｡⋆୨୧˚　˚୨୧⋆｡˚ ⋆" + id + "님 회원가입을 축하합니다" + "⋆ ˚｡⋆୨୧˚　˚୨୧⋆｡˚ ⋆");
		} else {
			System.out.println("회원가입 중 오류 발생");
		}
	}

	// 전체조회
	public void list() {
		List<PostVO> list = pDao.postVoList();
		for (PostVO post : list) {
			System.out.println(post.toString());
		}
		if (list == null)
			System.out.println("조회된 정보 없음");
	}


//인기글 조회
	public void goodList() {
		List<PostVO> list = pDao.postVoGoodList();
		for (PostVO post : list) {
			System.out.println(post.toString());
		}
		if (list == null)
			System.out.println("조회된 정보 없음");
	}
	
	// 게시글 입력
	public void add() {
		System.out.println("♥　♡　♥　♡　♥　♡　♥ 게시글 작성 페이지 ♥　♡　♥　♡　♥　♡　♥");
		System.out.println("제목을 입력>");
		String title = sc.nextLine();
		System.out.println("내용을 입력>");
		String contents = sc.nextLine();

		PostVO post = new PostVO();
		post.setPostId(id);
		post.setPostTitle(title);
		post.setPostContents(contents);
		post.setPostGood(0);

		if (pDao.addPost(post) > 0) {
			System.out.println("작성완료!");
		} else {
			System.out.println("작성중 에러");
		}

	}

	// 게시글 수정
	public void modify() {
		System.out.println("♥　♡　♥　♡　♥　♡　♥ 게시글 수정 페이지 ♥　♡　♥　♡　♥　♡　♥");
		while (true) {
			System.out.println("수정할 게시글 번호 입력>");
			int num = Integer.parseInt(sc.nextLine());
			PostVO post = pDao.getPost(num);
			if (post == null) {
				System.out.println("게시글이 존재하지 않습니다.");
				break;
			} else if (!post.getPostId().equals(id)) {
				System.out.println(id + "님이 작성한 글이 아닙니다. 다시 선택해주세요");
			} else if (post.getPostId().equals(id)) {
				String title = post.getPostTitle();
				String contents = post.getPostContents();
				while (true) {
					System.out.println("번호를 입력하세요");
					System.out.println("1. 제목 수정 | 2. 내용 수정 | 3. 수정종료");
					int menu = Integer.parseInt(sc.nextLine());
					if (menu == 1) {
						System.out.println("제목을 입력>");
						title = sc.nextLine();
					} else if (menu == 2) {
						System.out.println("내용을 입력>");
						contents = sc.nextLine();
					} else if (menu == 3) {
						break;
					}
				}
				if (pDao.updatePost(title, contents, num) > 0) {
					System.out.println("수정 완료!!");
					break;
				} else {
					System.out.println("수정 중 오류 발생");
					break;
				}
			}
		}
	}

	// 삭제
	public void remove() {
		while (true) {
			System.out.println("삭제할 게시글 번호 입력>>");
			int num = Integer.parseInt(sc.nextLine());
			PostVO post = pDao.getPost(num);
			if (post == null) {
				System.out.println("게시글이 존재하지 않습니다.");
				break;
			} else if (!post.getPostId().equals(id)) {
				System.out.println(id + "님이 작성한 글이 아닙니다. 다시 선택해주세요");
			} else if (post.getPostId().equals(id)) {
				if (pDao.deletePost(num) > 0) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("처리중 에러");
				}
				break;
			}
		}

	}

	// 로그인
	public void login() {
		System.out.println("♥　♡　♥　♡　♥　♡　♥ 로그인 페이지 ♥　♡　♥　♡　♥　♡　♥");
		System.out.println("아이디입력>");
		id = sc.nextLine();
		System.out.println("비밀번호입력>");
		String pw = sc.nextLine();
		CustomerVO customer = cDao.getCustomer(id);
		if (customer == null || !customer.getCustomerPw().equals(pw) ) {
			System.out.println("로그인 실패");
		} else if (customer.getCustomerPw().equals(pw)) {
			System.out.println("♬♩♪♩　　" + id + "님 안녕하세요　　♩♪♩♬");
			page();

		}

	}
	// 단건조회
	public void search() {
		System.out.println("조회할 게시판 번호 입력>");
		int num = Integer.parseInt(sc.nextLine());

		PostVO post = pDao.getPost(num);
		if (post == null) {
			System.out.println("조회된 정보가 없습니다");
		} else {
			System.out.println("⋇⋆✦⋆⋇　 " + num + "번 게시글 입니다　 ⋇⋆✦⋆⋇");
			System.out.println("제목 : " + post.getPostTitle());
			System.out.println("작성자 : " + post.getPostId());
			System.out.println("내용 : " + post.getPostContents());
			System.out.println("추천수 : " + post.getPostGood());
			System.out.println();
			
			System.out.println("이글을 추천하시겠습니까?");
			System.out.println("1.추천 | 2. 나가기");
			int good = Integer.parseInt(sc.nextLine());
			if(good==1) {
				pDao.goodPost(num, post);
				System.out.println("∞ ₒ ˚ ° 𐐒𐐚 ° ˚ ₒ ∞ 추천완료 ∞ ₒ ˚ ° 𐐒𐐚 ° ˚ ₒ ∞");
			}
			
		}
	}

	// 로그인 후 페이지 이동
	public void page() {
		while (true) {
			System.out.println("1.게시글 전체조회 | 2.게시글 상세조회 | 3. 게시글 작성 | 4.게시글 수정 | 5.게시글 삭제 | 6. 인기글 조회 | 99. 로그아웃");
			System.out.println("메뉴를 선택하세요>");
			int menu_2 = Integer.parseInt(sc.nextLine());
			if (menu_2 == 1) {
				System.out.println("=============================================");
				list();

			} else if (menu_2 == 2) {
				search();
			} else if (menu_2 == 3) {
				add();
			} else if (menu_2 == 4) {
				modify();
			} else if (menu_2 == 5) {
				remove();
			} else if (menu_2 == 6) {
				goodList();
			} else if (menu_2 == 99) {
				System.out.println("로그아웃 되었습니다.");
				break;
			}
		}
	}
}
