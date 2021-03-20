package com.kita.second.level3.cafe;
import java.util.ArrayList;
import java.util.List;
// 메뉴판 항목
public class Menu {
	private MenuItem[] arr = new MenuItem[4];

public Menu() {
	arr[0] = new MenuItem("아메리카노", 2000);
	arr[1] = new MenuItem("카페라떼", 2300);
	arr[2] = new MenuItem("카페모카", 2500);
	arr[3] = new MenuItem("카라멜마끼아또", 2600);
}

public void showMenus(MenuItem mi) {
		System.out.println("Menu");
		for(int i=0; i<arr.length; i++) {
			MenuItem mi = arr[i];
//			System.out.printf("%s\t\t%, d원", mi.getName());
			String menuLine = mi.toString();
			System.out.println(menuLine);
		}
	}

public MenuItem choose(int idx) {
	return arr[idx];
	}

}
