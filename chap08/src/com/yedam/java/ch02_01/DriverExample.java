package com.yedam.java.ch02_01;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver(); 
		
		driver.drive(new Taxi()); //호출할때 taxi 구현 클래스를 부르는 동작이 자동타입변환이다.
		driver.drive(new Bus());
		
	}
}
