package com.yedam.java.ch02.set;

public class Member {
	//필드
	public int id;
	public String name;
	
	//생성자
	public Member(int id, String name) {  //인스턴스를 만들때 값을 받아 올거임
		this.id = id;
		this.name = name;
	}
	
	//메소드
	@Override
	public int hashCode() {   		//같은 회원이 있는지 검사
		return id + name.hashCode(); //id는 int라서 그대로 더하고 name은 String이니까 해쉬코드로 더함
										//name의 해쉬코드는 똑같은 값을 가지면 똑같은 해쉬코드 값을 가지도록 오버라이딩 되어있음
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (id==member.id) && (name.equals(member.name));  //id가뭐야?
		}
		return false;
	}
}
