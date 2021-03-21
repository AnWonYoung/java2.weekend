package com.kita.second.level3.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList<Card>();
	
	public CardDeck() {
		init();
	}
	
	private void init() {
		// 반복문을 사용해서 CardDeck인 arr안에 중복되지 않게 Card 타입 인스턴스 생성하여 집어넣기
		for(int i=0; i<Card.PATTARNS.length; i++) {
			for(int z=1; z<=13; z++) {
					int point = z;
					if(z > 10) {
						point = 10;
						}
				
					arr.add(new Card(Card.PATTARNS[i], getDeno(z), point));
			}
		}
		
	
	}
	
	private String getDeno(int num) {
		//1~13
		switch(num) {
		// 1 A, 11 J, 12 Q, 13 K, 나머지는 숫자값 그대로 리턴
		case 1: return"A";
		case 11: return"J";
		case 12: return"Q";
		case 13: return"K";
		default : return String.valueOf(num);
		}
	}
	
	public Card getCard() {
		//0~list의 크기보다 1작은 값까지 중 한 값을 랜덤으로 뽑기, list에서는 삭제, return 뽑은 값
		int list = (int)(Math.random() * arr.size());
		return arr.remove(list);
	}
	
	@Override
	public String toString() {
		String str = "";
		for(Card c : arr) {
			str += (c + "\n");
		}
		return str;
	}

}
