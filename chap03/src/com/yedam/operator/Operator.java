package com.yedam.operator;

public class Operator {
	public static void main(String[] args) {
		// ++num, num++
		int num = 0;
		System.out.println(num++); // 실행하고 나서 증가
		System.out.println(++num); // 실행 전에 증가

		System.out.println(num--);
		System.out.println(--num);

		// 논리 부정 연산자 ! = not
		boolean play = true;
		System.out.println(play);
		play = !play;
		System.out.println(play);

		// 비교연산자 : true, false
		int num1 = 10;
		int num2 = 10;

		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		char char1 = 'A'; // 65
		char char2 = 'B'; // 66

		boolean result4 = (char1 < char2);
		System.out.println(result4);

		// and -> *, or -> +, true -> 1, false -> 0
		// && -> false하나라도 있으면 수행 안함, &->끝까지 수행함, &&가 더 효율적임

		// 논리연산자
		// &&, ||, !, ^
		char charCode = 'A'; // 65
		// A보다 크고 Z보다 작다
		if (charCode >= 65 && charCode <= 90) {
			System.out.println("대문자입니다.");
		}
		if (charCode >= 97 && charCode <= 122) {
			System.out.println("소문자입니다.");
		}
		// '0'=48, '9'=57
		// < + not(!) == >=
		if (!(charCode < 48) && !(charCode > 57)) {
			// charCode >= 48 && charCode<=57
			System.out.println("숫자입니다.");
		}

		// 복합 대입 연산자
		int result = 0;
		result += 10;
		System.out.println("result += " + result);
		result -= 5;
		System.out.println("result -= " + result);
		result *= 5;
		result /= 5;
		
		//삼항연산자
		int score = 80;
		char grade = score >= 80 ? 'B' : 'C';
		System.out.println(grade);
		

	}
}
