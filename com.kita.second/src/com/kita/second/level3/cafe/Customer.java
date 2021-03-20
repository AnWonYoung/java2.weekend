package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu m) {
		m.showMenus(); // 메뉴판 보여주기 
		
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;
		
		while(mi == null) {
				System.out.print("메뉴 번호를 입력 : ");
				String menuNo = scan.nextLine();
				int menu_No;
				try {
					int intMenuNo = Integer.parseInt(menuNo);
					mi = m.choose(menu_No -1);
				} catch(NumberFormatException e) {
					System.out.println("숫자만 입력해주세요.");
				} catch(Exception e) {
					System.out.println("메뉴를 잘못 입력했습니다.");
				} 
				
		}
		scan.close();
		return mi;
	}
	
	void drinkCoffee(Coffee coffee) {
		String name = coffee.getName();
		System.out.println(name+"(을)를 마신다.");
		
	}
}
	


