package com.yedam.ch01;

public class Car {
	private int speed;
	private int maxSpeed;
	private String model;
	
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	
	public String getModel() {
		return this.model;
	} //getter
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	} //getter
	
	public void setSpeed(int speed) {
		this.speed = speed;
	} //setter
	
	public int getSpeed() {
		return this.speed;
	} //getter
	
	
	
}
