package com.yedam.java.ch02;

public class Agency implements Rentable<Home, RentalList> {//인터페이스 구현 클래스

	@Override
	public Home rent() {
		return new Home();
	}

	@Override
	public RentalList getCount() {
		return new RentalList();
	} 
	
	

}
