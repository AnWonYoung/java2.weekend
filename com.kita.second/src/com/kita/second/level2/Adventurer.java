package com.kita.second.level2;

public class Adventurer {
	// 필드
	int strength;
	int dexterity;
	int intellegence;
	int luck;
	int hp;
	
	// 생성자
	public Adventurer () {
		strength = 10;
		dexterity = 10;
		intellegence = 10;
		luck = 10;
		hp = 10;
	}

	public Adventurer(int strength, int dexterity) { // 나중에 개별로 값을 넣고 싶을 때
		this.strength = strength;
		this.dexterity = dexterity;
	}
	
	
	// 메소드
	void attack() {
		System.out.println("공격을 한다.");
	}
	void jum() {
		System.out.println("점프를 한다.");
	}

}
