package com.kita.second.level3.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	//Gamer의 덱
	private List<Card> arr;
	
	//arr 안에 LinkedList 인스턴스 들어가는 Gamer 생성자 작성
	public Gamer() {
		arr = new LinkedList();
	}
	
	//Gamer의 덱 안에 카드 한 장씩 추가하는 메소드
	public void receiveCard(Card card) {
		arr.add(card);
	}
	
	//Gamer의 덱 안에 있는 카드 전체 출력하는 메소드
	public void printCard() {
		for(Card c : arr) {
			System.out.println(c);
		}
	}
	//Gamer의 덱에 있는 카드 전체 점수 리턴하는 메소드
	public int getTotalPoint() {
		int sum = 0;
		for(Card c : arr) {
			sum += c.getPoint();
		}
		return sum;
	}
	
	//카드를 더 받을지 말지 결정하는 메소드 //게이머가 그만둘 때까지 카드를 더 받는 메소드
	Scanner scan = new Scanner(System.in);
	public void moreCards() {
		while(true) {
			printCard();
			System.out.println("카드를 더 받으십니까? (yes/no");
			String answer = scan.nextLine();
			
			if(answer.equals("yes")) {
				receiveCard();
			} else(answer.equals("no")) {
				break;
			}
		}
		scan.close();
	}
}
