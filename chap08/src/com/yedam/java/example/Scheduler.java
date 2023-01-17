package com.yedam.java.example;

public interface Scheduler { //인터페이스 : 상수 + 추상메소드
							//인터페이스는 기능적인 부분을 보기 

	public void getNextCall();
	public void sendCallToAgent();
}
