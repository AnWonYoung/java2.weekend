package com.kita.second.level2;
// Animal 상속 받기 예제
public class Dog extends Animal { // extends 후 가져올 부모 클래스 명
	boolean cutiness;
	// 필드와 메소드 추가가 없으면 생략 가능
	
	public Dog(String name) {
		super(name); // 부모 클래스의 생성자를 가지고 온다는 뜻 this.name = name;으로 명시할 필요가 없음
		super.name = "흰둥이"; // this 안에 값을 넣듯이 super로도 넣는 게 가능함(잘 사용하진 않음)
		this.age = 10;
		this.cutiness = true; // 자식 클래스에만 있으니 this.로 적어주기
//		super.type = ""; private 접근 불가
	}
// Overriding 오버라이딩 하기
	@Override // 반드시 명시해야 함 메소드명 오타 방지
	void cry() {
		System.out.println("개가 운다."); // 부모 클래스에 있는 메소드를 다시 리네이밍 하는 것
	}
	
	
	void bark() {
		System.out.println("개가 짖는다.");
	}


}
