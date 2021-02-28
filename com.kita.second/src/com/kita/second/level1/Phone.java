package com.kita.second.level1;
// 객체지향 1번째 설계도 만들기
// 별도로 static 찍어내지 않고 설계를 짜며, 실행 시 static을 통해서 찍어내기
public class Phone {
	// 필드(속성)
	private String phoneName;
	private String owner;
	private String color;
	private int memory;
	private String phoneNumber; // int를 안 쓰는 이유 = 0부터 시작하는 수들은 다른 수가 나옴
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setMemory(int memory) {
		this.memory = memory;
	}
	
	String getColor() {
		return color;
	}
	
	int getMemory() {
		return memory;
	}
	
	
	
	// 생성자
	// 생성자가 정의되지 않았을 때만! 컴파일러가 기본 생성자를 넣어준다. 굳이 정의하는 이유는?
	// 먼저, 필드를 생성할 때는 디폴트 값(보통0, char일 때 빈칸, boolean일 때 false, 참조형 변수일 때 null)
	// 실행할 때 값을 일일히 넣어주는데 필드명이 많다면 양이 많아짐. 그래서 생성자를 정의해주는 것.
	// 메소드와 차이점  1) public과 생성자 사이에 리턴 타입이 없음 2) 내가 정의한 클래스 이름과 똑같은 이름을 가져야 함
	
	// 오버로딩이 가능해서 필드명이 같아도 여러 번 사용이 가능함
	public Phone() {
//		super();
	}
	
	// ()은 하나의 변수로서 이후에도 알아볼 수 있는 걸로 입력해두기
	public Phone(String phoneName, String color, int memory) { // 필드명과 매개변수 이름이 같으면 가까운 매개변수를 계속 받음 필드명을 받지X 그래서 this를 붙여줌
		this.phoneName = phoneName; // this.이 붙여져 있으면 필드를 일컫음
		this.color = color;
		this.memory = memory;	
	}	
	
	// Phone의 모든 필드에 초기값을 넣어주는 생성자 만들기
	
	public Phone(String phoneName, String owner, String color, int memory, String phoneNumber) {
		this.phoneName = phoneName;
		this.owner = owner;
		this.color = color;
		this.memory = memory;
		this.phoneNumber = phoneNumber;
	}
	
	
	/*메소드(동작)
	- 기본 형태
	리턴타입(혹은 보이드형) 메소드명(매개변수 기입) {} */
	
	// call(타입 person)
	// person에게 전화를 건다.
	
	void call(String person) {
		System.out.println(person + "에게 전화를 건다.");
	}
	
	// message(String person) {}
	// person에게 owner가 문자를 보낸다.
	
	void message(String person) {
		System.out.printf("%s에게 %s가 문자를 보낸다.", person, owner);
	}
	

}

//class Computer { 앞에 public을 붙일 수 없음, 파일 이름과 똑같은 곳에만 public을 붙이는 게 가능. 여러 클래스를 만들 수 있는 반면, 차이점!
//				      또한 자주 헷갈리기 때문에 이렇게 굳이 넣지 않음. 하나의 클래스당, 하나의 파일만 넣어주기.
//	
//}












