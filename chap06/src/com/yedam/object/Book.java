package com.yedam.object;

public class Book {
	// 필드
	String bookName;
	String kinds = "학습서";
	int price;
	String store = "한빛미디어";
	String bookNum;

	// 생성자
	Book(String bookName, int price, String bookNum) {
		this.bookName = bookName;
		this.price = price;
		this.bookNum = bookNum;

	}
	
	//매개변수의 타입에 따른 생성자 오버로딩
	Book(String kinds, String bookNum) {
		this.kinds = kinds;
		this.bookNum = bookNum;

	}
	
	//매개변수 순서에 따른 생성자 오버로딩
	//데이터 타입 기준으로 순서를 따진다
	Book(String kinds, int price) {
		this.price = price;
		this.kinds = kinds;
	}
	
	//매개변수 갯수
	Book(int price) {
		this.price = price;
	}
	
	//기본생성자
	Book(){
		
	}
	
	
	
	
	

	// 메소드
	void getInfo() {
		System.out.println(bookName);
		System.out.println("1)종류 : " + kinds);
		System.out.println("2)가격 : " + price + "원");
		System.out.println("3)출판사 : " + store);
		System.out.println("4)도서번호 : " + bookNum);
	}

}
