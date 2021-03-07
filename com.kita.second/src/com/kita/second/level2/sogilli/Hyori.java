package com.kita.second.level2.sogilli;

public class Hyori {
	// public : 제한X 공공 패키지
	// protected :
	// default : 접근 제한 없는 타입, 본인 패키지 내부
	// private : 자신 클래스 내부에서만 접근 가능
	
	public String music;
	int follower;
	private boolean star = true;
	
	
	public Hyori(String music) {
		this.music = music;
		follower = 100;
		star = true;
	}
	Hyori(int follower) {
		sing();
		drinkTea();
		yoga();
	}
	private Hyori(boolean star) {
		
	}
	
	
	public void sing() {
		
	}
	void drinkTea() {
		
	}
	private void yoga() {
		
	}

}
