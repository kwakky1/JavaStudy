package com.jse.card;

public interface CardService {
	public void setCards(Card[] cards);
	public Card[] getCards();
	public void add(Card card);
	public int getCount();
	public void setCount(int count);
	public String printCards();
}
