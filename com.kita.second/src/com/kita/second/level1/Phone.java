package com.kita.second.level1;
// 객체지향 1번째 설계도 만들기
public class Phone {
	// 필드(속성)
	String phoneName;
	String owner;
	String color;
	int momory;
	String phoneNumber;
	
	/*메소드(동작)
	- 기본 형태
	리턴타입(혹은 보이드형) 메소드명(매개변수 기입) {} */
	
	// call(타입 person)
	// person에게 전화를 건다.
	
	void call(String person) {
		System.out.println(person + "에게 전화를 건다.");
	}
	
	// message(String person) {}
	// person에게 owner가 문자를 보낸다.
	
	void message(String person) {
		System.out.printf("%s에게 %s가 문자를 보낸다.", person, owner);
	}
	

}
