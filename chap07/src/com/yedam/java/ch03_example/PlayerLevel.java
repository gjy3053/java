package com.yedam.java.ch03_example;

public abstract class PlayerLevel {

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	public abstract void showLevelMessage();
	
	public final void go(int count) {   //일반메소드로 정의 , 클래스에 파이널 붙이면 상속금지, 메소드에 붙이면 오버라이딩 금지
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}

}
