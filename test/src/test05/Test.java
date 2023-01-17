package test05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectNum = 0; // 메뉴 선택 변수
		int size = 0; // 주사위 크기
		int[] arr = null; // 주사위 기록 저장할 배열
		int max_num = 0;
		int min_num = 0;
		int count_2 = 0; // 최대값이 나온 횟수
		
		while (true) {
			System.out.println("====1. 주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료 =====");
			System.out.println("메뉴 > ");
			selectNum = Integer.parseInt(sc.nextLine());

			if (selectNum == 1) {
				while (true) {
					System.out.println("주사위 크기 > ");
					size = Integer.parseInt(sc.nextLine());
					if (size < 5 || size > 10) {
						System.out.println("주사위 크기는 5~10 입니다.다시 입력하세요");
					} else {
						break;
					}
				}

			} else if (selectNum == 2) {
				int count = 0; // 주사위 굴린 횟수
				arr = new int[size + 1];
				int randomNum = 0;
				while (randomNum != 5) {
					randomNum = (int) (Math.random() * size) + 1;
					count++;
					arr[randomNum]++;
				}
				System.out.println("5가 나올 때 까지 주사위를 " + count + "번 굴렸습니다.");

			} else if (selectNum == 3) {
				int max = 0; // 주사위 최대값
				int min = size;
				for (int i = 1; i < arr.length; i++) {
					System.out.println((i) + "은" + arr[i] + "번 나왔습니다");
					
					if (max < arr[i]) {
						max = arr[i];
						max_num = i;
					}

					if (min > arr[i]) {
						min = arr[i];
						min_num = i;
					}
				}

				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == max) {
						count_2++;
					}
				}

			} else if (selectNum == 4) {
				if (count_2 == 1) {
					System.out.println("가장 많이 나온 수는 " + max_num + "입니다");
				} else {
					System.out.println("가장 적게 나온 수는 " + min_num + "입니다");
				}

			} else if (selectNum == 5) {
				System.out.println("프로그램 종료");
				break;

			} else {
				System.out.println("1~5번까지 입력하세요");
			}

		}

	}

}
