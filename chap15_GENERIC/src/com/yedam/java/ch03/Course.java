package com.yedam.java.ch03;

public class Course {
	public static void registerCouse1(Applicant<?> applicant) { //물음표가 T를 대체하는것 
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함";
		System.out.println(message);
	}
	
	//super Worker -> Person이란 Worker만 등록가능 (Worker가 최종자손이다)
	public static void registerCouse2(Applicant<? super Worker> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함";
		System.out.println(message);
	}
	
	//extends Student -> Student, HightStudent, MiddleStudent
	public static void registerCouse3(Applicant<? extends Student> applicant) {
		String message = applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함";
		System.out.println(message);
	}
}
