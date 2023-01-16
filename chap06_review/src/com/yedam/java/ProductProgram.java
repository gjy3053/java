package com.yedam.java;

import java.util.Scanner;

public class ProductProgram {
	private Scanner sc = new Scanner(System.in); //필드
	private Product[] list = null;

	public ProductProgram() { // 생성자
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int selectNo = menuSelect();

			if (selectNo == 1) {
				// 상품 수 입력
				inputProductNum();

			} else if (selectNo == 2) {
				// 상품 및 가격 입력
				inputProductInfo();

			} else if (selectNo == 3) {
				// 제품 별 가격
				productInfoPrint();

			} else if (selectNo == 4) {
				// 분석
				productAnalysis();

			} else if (selectNo == 5) {
				// 프로그램 종료
				exit();
				break;

			} else {
				// 잘못된 메뉴 선택할 경우 안내메세지 출력
				pritErrorMessage();
			}

		}
	}

	private void pritErrorMessage() {
		System.out.println("메뉴를 잘못 선택했습니다");

	}

	private void exit() {
		System.out.println("프로그램을 종료합니다");

	}

	private void productAnalysis() {
		int max = 0;
		int productIndex = 0;
		for (int i = 0; i < list.length; i++) {
			Product product = list[i];
			if (max < product.getproPrice()) {
				max = product.getproPrice();
				productIndex = i;
			}
		}

		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			if (i == productIndex)
				continue;
			// Product product = list[i];
			sum += list[i].getproPrice();
		}

		System.out.println("최고 가격을 가진 제품은 " + list[productIndex].getProName() + "입니다");
		System.out.println("최고 가격을 제외한 제품들의 합은 " + sum + "입니다");

	}

	private void productInfoPrint() {
		for (Product product : list) {
			System.out.printf("%s : %d\n", product.getProName(), product.getproPrice());
		}

	}

	private void inputProductInfo() {
		for (int i = 0; i < list.length; i++) {
			System.out.println("상품명 >");
			String name = sc.nextLine();
			System.out.println("상품 가격> ");
			int price = Integer.parseInt(sc.nextLine());

			Product product = new Product(name, price);
			list[i] = product;
		}

	}

	private void inputProductNum() {
		System.out.println("상품수 입력>");
		int productNum = Integer.parseInt(sc.nextLine());
		list = new Product[productNum];

	}

	private int menuSelect() {
		System.out.println("선택 > ");
		return Integer.parseInt(sc.nextLine());
	}

	private void menuPrint() {
		System.out.println("=== 1. 상품수 | 2. 상품 및 가격 입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료 ===");
		System.out.println("선택 > ");

	}
}
