package com.yedam.java.ch01.object;

public class Key {
	// 필드
	public int number;

	// 생성자
	public Key(int number) {
		this.number = number;
	}

	// 메서드
	@Override
	public int hashCode() { // 똑같은 필드값을 가지고 있다면 동일한 해쉬코드값을 가짐
		return number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) { // 먼저 타입을 확인해야함, 타입자체가 다르면 확인안함
			Key key = (Key) obj; // 강제 타입변환
			if (number == key.number) {
				return true;
			}
		}
		return false;

	}

}
