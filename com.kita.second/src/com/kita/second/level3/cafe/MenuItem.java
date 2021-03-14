package com.kita.second.level3.cafe;
// 메뉴판 안의 항목
public class MenuItem {
	private String name;
	private int price;
	
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%s\t\t%,d원", name, price); //%d가 아닌 %,d << 숫자 ,를 찍어주는 것
	}
	
}
