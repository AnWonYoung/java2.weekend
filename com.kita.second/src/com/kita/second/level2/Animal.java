package com.kita.second.level2;

public class Animal extends Object{ // 오브젝트 굳이 없어도 됨
	String name;
	int age;
	private String type;
	
	// 생성자
	public Animal(String name) {
//		super();
		this.name = name;
	}
	
	// 메소드
	  void cry () {
		System.out.println("동물이 운다.");
	}
	  private void mothod() {
		  
	  }

}
