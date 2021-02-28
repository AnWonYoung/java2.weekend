package com.kita.second.level1;

import java.util.Scanner;

public class MacBookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MacBook myMacBook = new MacBook();
		myMacBook.surf();
		myMacBook.code();
		myMacBook.email("ㅇㅇ");
		
		MacBook mac1 = new MacBook(8);
		MacBook mac2 = new MacBook(8, 100);
		MacBook mac3 = new MacBook(8, "골드");
		MacBook mac4 = new MacBook(8, 100, "실버");
		
		
		
		
		
		
		
	}

}
