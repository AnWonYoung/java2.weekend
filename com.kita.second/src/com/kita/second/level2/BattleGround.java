package com.kita.second.level2;

public class BattleGround extends Game {
	public BattleGround (String title) {
		super(title);
	}
	
	@Override
	void playGame() {
		System.out.println("배그를 한다.");
	}
}
