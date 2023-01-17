package com.yedam.java.ch01_01;

public interface RemoteControl {
	
	//상수
	//public static final int MAX_VALUE = 10;
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 0;;
	
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
