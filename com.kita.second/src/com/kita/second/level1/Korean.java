package com.kita.second.level1;
// Class 추가 복습 변하지 않는 상수를 만들고 싶을 때
public class Korean {
	static final String NATION = "한국";
	final String ssn;
	String name;
	int age;
	static boolean LoveSpicy = true; // true라는 고정 값이 아닌 final이 없어서 false로 나오게 할 수도 있음
	
//	상수 값 = 절대 변하지 않는 값, 상수명은 반드시 대문자
//	final int LEN = 3;
//	LEN = 4; 상수임에도 바뀌는 이유? 아직 설계 단계라서 final이 있어도 다른 수로 바꿀 수 있음
	static final int LEN = 3; // static을 붙여서 상수 값을 고정해주기

	Korean(String ssn) { // ssn에 final을 붙여주려면 한 번 생성해서 값을 넣어주어야 함
		this.ssn = ssn;
	}

}
