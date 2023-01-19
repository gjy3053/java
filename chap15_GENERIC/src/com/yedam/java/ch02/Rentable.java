package com.yedam.java.ch02;

public interface Rentable<P, I> {
	
	//추상메소드 선언
	P rent();
	I getCount();
	
}
