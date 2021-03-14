package com.kita.second.level3;
// abstract 추상적인, 관념적으로 존재하는 것
public abstract class Animal {	// 중복을 피하고 공통된 속성을 사용하기 위해서
	
	String name;
	int age;
	
	// 생성자
	public Animal(String name) {
//		super(); 최상위 클래스라 자동으로 들어감
		this.name = name;
	}
	
	// 메소드
	
	  void breath() {			// 공통으로 가질 때 추상 만들기, 자식 클래스에서 반드시 써야 함
		  System.out.println("숨을 쉰다.");
	  }
	  abstract void cry();		// 추상 메소드는 실행 코드 X 

}
