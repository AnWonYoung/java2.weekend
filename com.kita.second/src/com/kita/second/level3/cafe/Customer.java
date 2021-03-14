package com.kita.second.level3.cafe;

public class Customer {
	public MenuItem order(Menu menu) {
		MenuItem mi = new MenuItem("아메리카노", 1500);
		return mi;
	}
	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name + "(을)를 마신다.");
	}
	

}
