package com.yedam.loop;

import java.util.Scanner;

public class LoopFor {
	public static void main(String[] args) {
//		for(int i=0; i<=100; i++) {
//			System.out.println(i);
//		}
//		
//		//1부터 100까지 합 구하기
//		int result = 0;
//		for(int i=1; i<=100; i++) {
//			result +=i;
//		}
//		System.out.println("1부터 100까지의 합 : " + result);
//		
//		//1~100사이의 짝수 구하기
//		//짝수 성질 => 2로 나누었을 때 0으로 떨어지면 짝수
//		for(int i=1; i<=100; i++) {
//			if(i%2==0) {
//				System.out.println(i+ "는 짝수");
//			} else if(!(i%2==0)) {
//				System.out.println(i+ "는 홀수");
//			}
//		}
//		
//		//입력한 숫자에 대한 구구단 출력
//		//스캐너를 활용해서 값을 하나 입력
//		//입력받은 값에 대한 구구단 출력
//		//2를 입력 -> 2*1 = 2....
//		
		Scanner sc = new Scanner(System.in);
//		System.out.println("구구단 입력>");
//		int gugu = Integer.parseInt(sc.nextLine());
//		for(int i=1; i<=9; i++) {
//			System.out.println(gugu + "*" + i + "=" + (gugu*i));
//		}
//		
//		
//		//입력한 값에 대한 총합, 평균, 최대값, 최소값, 데이터 받을 갯수
//		//스캐너 -> 데이터 입력
//		//데이터 받을 갯수 -> 5
//		//데이터 입력 횟수가 5번
//		//총합 : 값을 입력 받을 때마다 변수에 저장
//		//평균 : 총합/갯수
//		//최대값 : 입력할때마다 비교 최대값인지 아닌지
//		//최소값 : 입력할때마다 비교, 최소값인지 아닌지 
//		
		
		//1번문제
		System.out.println("횟수 입력>");
		int count = Integer.parseInt(sc.nextLine());
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min= 0;
		for(int i=0; i<count; i++) {
			System.out.println("데이터입력>");
			int num = Integer.parseInt(sc.nextLine());
			sum += num;
			if(i==0) {
				max = num;
				min = num;
			}
			
			if(max<num) {
				max = num;
			}
			if(min>num) {
				min=num;
			}
		}
		avg=(double)sum/count;
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %5.2f\n" , avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		//2번문제
		int number = (int)(Math.random()*100+1);
		int solve = 0;
		for(int i=0; i<5; i++) {
		System.out.println("숫자를 입력하세요>");
		solve = Integer.parseInt(sc.nextLine());
		if(number==solve) {
			System.out.println("정답입니다");
			break;
		} else if(solve>number) {
			System.out.println("더 작은 값을 입력하세요");
		} else {
			System.out.println("더 큰 수를 입력하세요");
		}
		if(i==4) {
			System.out.println("기회를 다 소진하였습니다.");
		}
		}
	}
}

