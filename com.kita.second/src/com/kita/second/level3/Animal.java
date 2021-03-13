package com.kita.second.level3;
// abstract 추상적인, 관념적으로 존재하는 것
public abstract class Animal {
	
	String name;
	int age;
	private String type;
	
	// 생성자
	public Animal(String name) {
//		super(); 최상위 클래스라 자동으로 들어감
		this.name = name;
	}
	
	// 메소드
	  void cry () {
		System.out.println("동물이 운다.");
	}

}
