package com.yedam.object;

//클래스 선언
/*
 * static 필드 	  : public
 * instance 필드 	  : private
 * 생성자 		  : public 
 * getter, setter : public 
 * 메서드 		  : public ( 일부는 private도 있을 수 있음)
 * 
 */
public class Circle {

	static final double pi = 3.14; // final -> 변경할 수 없다
	private double r;  //캡슐화

	
	public Circle() {}
	
	//r read/write    //setter, getter
	public void setR(double r) {
		this.r = r;
	}
	public double getR() {
		return r;
	}

	Circle(double r) {
		this.r = r;
	}

	public double area() {
		double result = pi * r * r;
		return result;
	}
}
