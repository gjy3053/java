package com.yedam.array;

import java.util.Scanner;

public class StudentAry {

	public static void main(String[] args) {
		// 한 학생의 성적을 입력
		// 과목수
		int subjectNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		while (true) {

			System.out.println("==================================================");
			System.out.println("1. 과목수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==================================================");
			System.out.println("메뉴 입력> ");

			int selectNo = Integer.parseInt(sc.nextLine());
			if (selectNo == 1) {
				System.out.println("과목수를 입력하세요>");
				subjectNum  = Integer.parseInt(sc.nextLine());

			} else if (selectNo == 2) {
				scores = new int[subjectNum];
				for(int i=0; i<subjectNum; i++) {
					System.out.println((i+1) + "번째 과목 점수 입력>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}

			} else if (selectNo == 3) {
				for(int i=0; i<subjectNum; i++) {
					System.out.println((i+1) + "번째 과목 점수 : " + scores[i]);
					sum += scores[i];
					
				}

			} else if (selectNo == 4) {
				// 평균, 총합
				System.out.println("총합은 " + sum + "점 입니다");
				System.out.println("평균은 " + ((double)sum/scores.length) + "점 입니다");
				

			} else if (selectNo == 5) {
				System.out.println("end of prog");
				break;
			}

		}

	}

}
