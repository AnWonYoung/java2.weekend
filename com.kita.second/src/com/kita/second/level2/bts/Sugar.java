package com.kita.second.level2.bts;

import com.kita.second.level2.sogilli.Hyori;

public class Sugar {
	void method() {
		Hyori hr = new Hyori("유고걸");
		String music = hr.music;
//		int follower = hr.follower;
	
		
		hr.sing();
//		hr.drinkTea();
//		hr.yoga();

//		Hyori hr2 = new Hyori(100);		Default 생성자	다른 패키지라 불가능함
//		Hyori hr3 = new Hyori(true);	Private 생성자	본인 클래스에서만 가능함

	}	
}