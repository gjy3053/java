package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Set;

public class MemberExample {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member(1000,"홍길동" ));
		set.add(new Member(1000,"홍길동" )); //set은 중복값을 허용하지 않음

		System.out.println("총 객체 수 : " + set.size()); //그런데 중복값 들어감 -> new연산자 써서 메모리에는 2개의 멤버가 들어감
													   // 자바에서는 내부에 있는 값이 같더라도 메모리 주소가 다르면 다르다고 인식
													//Member클래스에서 오버라이딩 하니까 중복값 제거
	}

}
