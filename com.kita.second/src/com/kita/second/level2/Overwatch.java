package com.kita.second.level2;

public class Overwatch extends Game {
	public Overwatch (String title) {
		super(title);
	}
	
	@Override
	void playGame() {
		System.out.println("오버워치를 한다.");
	}

}
