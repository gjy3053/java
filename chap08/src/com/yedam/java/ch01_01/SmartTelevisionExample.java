package com.yedam.java.ch01_01;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision  tv = new SmartTelevision();
		
		tv.turnOn();
		tv.search("네이버");
		tv.setVolume(-100);
		tv.setVolume(20);
		tv.turnOff();
		
		RemoteControl rc = tv;   //기능을 제한하기 위해서 사용함
		Searchable searchable = tv; 
		
		
		
	}
}
