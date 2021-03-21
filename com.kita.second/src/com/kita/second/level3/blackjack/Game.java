package com.kita.second.level3.blackjack;

public class Game {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		
//		System.out.println(cd);
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		
		System.out.println("딜러 덱");
		 dealer.printCard();
		 System.out.println("게이머 덱");
		 gamer.printCard();
		 
		 Rule.whoIswin(gamer, dealer);
	}

}
