package com.yedam.java.ch03.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 95);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println("\t홍길동 : " + map.get("홍길동")); //map은 값을 덮어씀, set은 튕김
		System.out.println();
		
		//키로
		Set<String> keySet = map.keySet();
		for(String name : keySet) {
			int score = map.get(name);//map에서 값 빼오기
			System.out.println("\t" + name + " : " + score);  //순서는 보장되지 않음 set이기 때문에 
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		//엔트리로 
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			
			System.out.println("\t" + key + " : " + value);
		}
	}

}
