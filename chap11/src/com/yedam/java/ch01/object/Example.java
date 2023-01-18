package com.yedam.java.ch01.object;

import java.util.HashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동"); // 등호로 비교하면 참조타입이라서 동등하지 않다. 주소가 다다르니까
		Member m2 = new Member("신윤권");
		Member m3 = new Member("신윤권");

		if (m1.equals(m2)) {
			System.out.println("m1과 m2는 동등합니다");
		} else {
			System.out.println("m1과 m2는 동등하지 않습니다.");
		}

		if (m2.equals(m3)) {
			System.out.println("m2과 m3는 동등합니다");
		} else {
			System.out.println("m2과 m3는 동등하지 않습니다.");
		}

		Map<Key, String> hashMap = new HashMap<Key, String>(); // Map은 인터페이스, 해쉬맵은
		hashMap.put(new Key(1), "홍길동");

		String name = hashMap.get(new Key(1));
		System.out.println(name);
		
		System.out.println();
		
		String message = "오늘은 수요일입니다.";
		System.out.println(message);
		System.out.println(m1); 
		
	}

}
