package com.yedam.java.ch01_01;

public class SportsCar extends Car{

	@Override
	public void seedUp() {
		speed += 10;
	}
	
	public void carStop() {
		super.stop();
		//this.maxSpeed = 400;
	}
}
