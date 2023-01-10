package com.yedam.variable;

public class Variable01 {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour) * 60 + minute;
		System.out.println("총 " + totalMinute + "분");
		
		int value = 0;
		int result = value + 10;
		System.out.println(result);
		
		int x = 3;
		int y = 5;
		
		int z = 0;
		z=x;
		x=y;
		y=z;
		System.out.println(x + "," + y);
		
	}

}
