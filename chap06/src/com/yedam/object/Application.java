package com.yedam.object;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// 클래스 생성해서 객체 만든 다음 객체 바로 사용
		// 객체를 한 곳에 모아서 관리하는 형태
		// 배열
		// int[] ary = new int[4];
		// Student[] stdAry = new Student[10];

		// 학생정보 보관하는 배열
		Student[] stdAry = null;
		int stdNum = 0;
		Scanner sc = new Scanner(System.in);

		// while문을 활용해서 학생 관리 프로그램 작성
		while (true) {
			System.out.println("===================================================");
			System.out.println("1. 학생 수 | 2. 정보입력 | 3. 정보확인 | 4. 분석 | 5. 종료");
			System.out.println("===================================================");

			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				// Student 클래스로 만들어지는 객체를 몇개나 배열에 넣을지
				// 에 대한 값을 받아옴
				System.out.println("학생 수>");
				stdNum = Integer.parseInt(sc.nextLine());
			} else if (selectNo == 2) {
				stdAry = new Student[stdNum];
				for (int i = 0; i < stdAry.length; i++) {
					stdAry[i] = new Student();
					System.out.println("이름>");
					stdAry[i].name = sc.nextLine();
					System.out.println("나이>");
					stdAry[i].age = Integer.parseInt(sc.nextLine());
					System.out.println("학교>");
					stdAry[i].schoolName = sc.nextLine();

					// 성적입력
					System.out.println("국어점수>");
					stdAry[i].kor = Integer.parseInt(sc.nextLine());
					System.out.println("영어점수>");
					stdAry[i].eng = Integer.parseInt(sc.nextLine());
					;
					System.out.println("수학점수>");
					stdAry[i].math = Integer.parseInt(sc.nextLine());
					;

				}

			} else if (selectNo == 3) {
				for (Student std : stdAry) {
					std.getInfo();
				}

			} else if (selectNo == 4) {
				// 총합, 평균
				int total = 0;
				double avg = 0;
				System.out.println("전체 학생 총합 / 평균 조회");
				for (int i = 0; i < stdAry.length; i++) {
					total = stdAry[i].kor + stdAry[i].eng + stdAry[i].math;

					avg = total / 3.0;
					System.out.println(stdAry[i].name + "학생>");
					System.out.println("총합 : " + total + "평균 : " + avg);
				}

				// 시험 젤 잘 친 과목, 못친 과목 확인
				
				int max = 0;
				int min = 0;
				for (int i = 0; i < stdAry.length; i++) {

					max = stdAry[i].kor;
					min = stdAry[i].kor;

					if (stdAry[i].eng < stdAry[i].math) {
						if (max < stdAry[i].math) {
							max = stdAry[i].math;
						}
					} else {
						if (max < stdAry[i].eng) {
							max = stdAry[i].eng;
						}

					}
					System.out.println(stdAry[i].name + "최고성적 : " + max);

				}

			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

		// Student s1 = new Student(); //Student는 클래스 s1는 인스턴스(객체)
		// Student s2 = new Student();

//		System.out.println(s1);
//		System.out.println(s2);

		// dot 연산자
//		s1.age = 20;
//		s1.name = "예담";
//		s1.schoolName = "예담대학교";
//		s1.getInfo();
//
//		s2.age = 30;
//		s2.name = "대예담";
//		s2.schoolName = "예담대학원";
//		s2.getInfo();

//		s1.getInfo();
//		
//		s1.age = 20;
//		s1.name = "대학생";
//		
//		System.out.println("학생의 나이 : " + s1.age);
//		System.out.println("학생의 이름 : " + s1.name);
//		System.out.println("재학중인 학교 : " + s1.schoolName);

//		Korean k1 = new Korean("김또치", "000000-0000000");
//		
//		System.out.println("k1이 가지고 있는 필드값 >");
//		System.out.println(k1.nation);
//		System.out.println(k1.name);
//		System.out.println(k1.ssn);

//		Book b1 = new Book("혼자 공부하는 자바", 24000, "yedam-001");
//		b1.getInfo();
//
//		System.out.println();

//		Book b2 = new Book("이것이 리눅스다", 32000, "yedam-002");
//		b2.getInfo();

	}

}
