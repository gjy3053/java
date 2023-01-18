package com.yedam.java.ch01.object;

public class Member { // 자동적으로 object의 자식클래스임
	// 필드
	public String id;

	// 생성자
	public Member(String id) {
		this.id = id;
	}

	// 메서드
	@Override
	public boolean equals(Object obj) { // 같은타입인지 내부에 있는 필드값이 같은지
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id))
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode(); // 필드가 string이라면 hashcode쓰면 됨
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}

	
	

}
