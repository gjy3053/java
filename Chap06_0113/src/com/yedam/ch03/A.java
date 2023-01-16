package com.yedam.ch03;

//보통 protected와 public 많이 씀
public class A {
	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A ("문자열");

	// 생성자 
	public A(boolean b) {
	}

	A(int b) {
	}

	private A(String s) {  // private -> singleton 쓸때 주로 사용 
	}

	// 메소드
}
