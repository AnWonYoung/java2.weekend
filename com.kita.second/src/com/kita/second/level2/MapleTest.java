package com.kita.second.level2;

public class MapleTest {
	public static void main(String[] args) {
		Adventurer adv = new Adventurer();
		Magician mg = new Magician();
//		adv.mp = 10; 자식 클래스에만 있음
		mg.mp = 10;
		adv.attack();
		adv.jum();
		mg.teleport();
	}

}
