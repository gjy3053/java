package com.yedam.reference;

public class StringRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = "yedam";
		String strVal2 = "yedam";

		// 문자열 주소값으로 비교
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 메모리 주소가 같다");
		} else {
			System.out.println("strVal1과 strVal2는 메모리 주소가 다르다");
		}

		// 문자열(String)간의 데이터 비교
		if (strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 데이터 동일");
		} else {
			System.out.println("strVal1과 strVal2는 데이터 다름");
		}
		
		System.out.println();
		//new 연산자를 활용한 String 새롭게 객체 생성
		//heap에 객체를 만든다
		//heap에 String 데이터를 넣을 수 있는 새로운 공간을 만든다.
		String strVal3 = new String("yedam"); //새로운 공간(100번지)
		String strVal4 = new String("yedam"); //새로운 공간(200번지)
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소");
		}else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소");
		}

		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4는 데이터 같다");
		}else {
			System.out.println("strVal3과 strVal4는 데이터 다르다");
		}
		
		
		System.out.println();
		//String strVal1 = "yedam"
		//Siring strVal3 = new String("yedam")
		if(strVal1 == strVal3) {
			System.out.println("strVal1과 strVal3은 같은 메모리 주소");
		}else {
			System.out.println("strVal1과 strVal3은 다른 메모리 주소");
		}
		
		
		
		
		
		
	}

}
