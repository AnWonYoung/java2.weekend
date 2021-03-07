package com.kita.second.level2;

public class Magician extends Adventurer{
	// Adventurer 클래스를 상속 받아서
	// mp 필드 추가하기
	// attack 메소드를 "마법공격"으로 재정의하기
	// teleport 메소드 추가
	
	int mp;
	
	public Magician() { // 생성자
		super();
	}
	
	@Override
	void attack() {
		System.out.println("마법공격.");
	}
	
	void teleport() {
		System.out.println("텔레포트를 한다.");
	}

}
