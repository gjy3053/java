package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // set은 인덱스가 없음

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");
		set.add("Java");

		int size = set.size();
		System.out.println("총 객체 수 : " + size); // 기존에 값이 있는 것은 들어가지 못함
		System.out.println();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {  //set에 다음값이 있으면 실행해라
			String element = iterator.next(); //다음값 저장
			System.out.println("\t" + element); // set은 순서가 보장되지 않는다. 
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
	
		for(String skill : set) {
			System.out.println("\t" + skill);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("내부가 비어있습니다."); //인스턴스는 있는데 내부 값이 없다
		}
	}

}
