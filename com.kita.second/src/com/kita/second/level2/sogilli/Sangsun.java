package com.kita.second.level2.sogilli;

public class Sangsun {
	void method() {
		Hyori hr = new Hyori("유고걸");
		String music = hr.music;
		int follower = hr.follower;
//		boolean star = hr.star; 
		
		hr.sing();
		hr.drinkTea();
//		hr.yoga();
		
		Hyori hr2 = new Hyori(100); // Default 값 생성자
//		Hyori hr3 = new Hyori(true); 	Private 생성자 Hyori클래스에서만 사용가능

	}
	

}


