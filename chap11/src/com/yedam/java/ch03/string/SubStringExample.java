package com.yedam.java.ch03.string;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn = "880815 1234567";
		
		//substring(start, end) -> Index start 부터 end전까지 출력 
		String firstNum = ssn.substring(0,6); //0~5번째 자리까지 출력
		System.out.println("생년월일 : " + firstNum);
		
		//substring(start) -> Index start 부터 끝까지 
		String secondNum = ssn.substring(7);
		System.out.println("개인정보 : " + secondNum);
		
		String[] numList = ssn.split(" ");
		for(String num : numList) {
			System.out.println(num);
		}
		

	}

}
