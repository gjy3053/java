package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {
	public static void main(String[] args) throws IOException {
		// keyCode 하나의 문자 받아올 때

		int keyCode = 0;

		System.out.print("입력>");

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);

		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);

		// Scanner
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력>");
		// scanner.nextLine() => enter키 이전까지 데이터를 받아 오세요
		String inputData = scanner.nextLine();// 이것만 쓰기 (nextInt와 같이 쓰면 enter키 때문에 오류남)
		System.out.println("Scanner활용 : " + inputData);

		// 기본타입, == (1==1)
		// 문자열 내용 비교
		if (inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다.");
		}

	}

}
