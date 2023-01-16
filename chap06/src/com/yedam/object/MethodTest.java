package com.yedam.object;

public class MethodTest {

	public static void main(String[] args) {
		//StringUtil su = new StringUtil();
		
		StringUtil.greet();
		
		StringUtil.greet("good morning");
		long l =  StringUtil.greetLength("good morning");
		System.out.println(l);
		

}

}
