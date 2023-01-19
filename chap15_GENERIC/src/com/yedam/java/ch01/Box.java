package com.yedam.java.ch01;

public class Box {
	private Object object; //Object -> 모든클래스의 부모라서 어떤클래스든 담을수있다.
	
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
	
}
