package com.kita.second.level1;
// 예제1
public class MacBook {
	// 메모리, 가격, 색상
	int memory;
	int price;
	String color;
	
	
	// 생성자 : 메모리만, 메모리와 가격, 메모리와 색상, 메모리와 가격 그리고 색상
	public MacBook() {
		
	}
	
	
	public MacBook(int memory) {
		this.memory = memory;
	}
	
	public MacBook(int memory, int price) {
		this.memory = memory;
		this.price = price;
	}
	
	public MacBook(int memory, String color) {
		this.memory = memory;
		this.color = color;
	}
	
	public MacBook(int memory, int price, String color) {
		this.memory = memory;
		this.price = price;
		this.color = color;
	}
	
	
	
	// 웹서핑을 한다, 코딩을 한다, ㅇㅇ에게 이메일을 보낸다
	
	void surf() {
		System.out.println("웹서핑을 한다.");
	}
	
	void code() {
		System.out.println("코딩을 한다.");
	}
	
	void email(String person) {
		System.out.println(person + "에게 이메일을 보낸다.");
	}

}
