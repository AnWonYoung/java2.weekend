package com.kita.second.level2;

public class Cat extends Animal{
		public Cat(String name) {
			super(name);			// super로 데려올 때 부모 클래스에 있는 String name으로 같이 받기
		}
		
	@Override
	void cry() {
		System.out.println("고양이가 운다.");
	}
}
