package com.jse.card;

public class CardServiceImpl {
	private Card[] cards;
	private int count;
	public CardServiceImpl() {
		cards = new Card[3];
		count = 0;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	public Card[] getCards() {
		return cards;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void add(Card card) {
		cards[count]=card;
		count++;
	}
}
