package com.yedam.java.example;

import java.util.Scanner;

public class ScheduleExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scheduler scheduler = null;  //배열(은 대괄호 있어야하니까 제외), 클래스 , 인터페이스만 null로 초기화 가능 
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");
		
		
		String ch = scanner.next();
		
		if("R".equals(ch) || "r".equals(ch) ) {
			scheduler = new RoundRobin();  //일반 클래스, 자동타입변환이 일어남 , 캐스팅괄호가 없으니까
		}else if("L".equals(ch) || "l".equals(ch) ) {
			scheduler = new LeastJob(); 
		}else if("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall(); //상담원 : 다음 전화   //추상클래스이다, 스케쥴러라는 타입으로 선언된 변수는 이 두개의 코드가 존재한다
		scheduler.sendCallToAgent(); //배분방법   //추상클래스로 강제성을 띄고있다
	}
}
