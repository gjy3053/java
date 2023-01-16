package com.yedam.object;

public class CircleSingle {

	// 싱글톤

	static CircleSingle instance = new CircleSingle();

	static CircleSingle getInstace() {
		return instance;
	}

	static final double pi = 3.14; // final -> 변경할 수 없다
	double r;

	private CircleSingle() {

	} // 외부에서 객체 생성 못하게 private처리

	CircleSingle(double r) {
		this.r = r;
	}

	double area() {
		double result = pi * r * r;
		return result;
	}
}
