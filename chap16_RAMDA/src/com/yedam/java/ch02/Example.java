package com.yedam.java.ch02;

public class Example {

	public static void main(String[] args) {
		// 매개변수가 없는 경우
		Workable work = () -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		};

		work.work();

		work = () -> System.out.println("퇴근을 합니다.");
		work.work();

		// 매개변수가 있는 경우
		Speakable speak = (x) -> {
			System.out.println("현재 볼륨은 중간입니다");
			System.out.println("현재 재생되는 음악은 " + x + "입니다.");
		};

		speak.speak("뉴진스 - HypeBoy");
		speak = x -> System.out.println("현재 재생되는 음악은 " + x + "입니다."); // 매개변수가 1개이고 실행 코드가 1개일때 괄호 생략
		speak.speak("갓더비트 - Strum up");

		// 리턴값이 있는 경우
		Calculator cal = (x, y) -> {
			int result = (int) (x + y);
			return result;
		};
		System.out.println("첫번째 방식 : " + cal.plus(5.8, 6.9));

		cal = (x, y) -> (int) (x + y); // return 생략 가능
		System.out.println("두번째 방식 : " + cal.plus(5.8, 6.9));

	}

}
