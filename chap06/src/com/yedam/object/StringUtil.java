package com.yedam.object;

public class StringUtil {

	// hello인사
	static void greet() {
		System.out.println("hello");
	}

	static void greet(String str) {
		System.out.println(str);
	}
	
	static long greetLength(String str) {
		long result;
		result = str.length();
		return result;
	}

}
