package com.kita.second.level3;

public class RCTest {
	public static void main(String[] args) {
		RCUser user = new RCUser();
		user.rc.turnOn();
		user.rc.setVolume(5);
		
		RCUser user2 = new RCUser(new Tv());
		user2.rc.turnOn();
		user2.rc.setVolume(5);
		
		user2.useRC(new Tv());
		
	}

}
