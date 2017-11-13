package object_orientation;

import java.util.ArrayList;

public class Card {
	enum Suit{Spade, Heart,Diamond,Club};
	enum Rank{Ace,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,J,Q,K};
	private Suit suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private Rank rank; //1~13
	
	/**
	 * @param s suit
	 * @param r rank
	 */
	public Card(Suit s,Rank r){
		suit=s;
		rank=r;
	}
	
	//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
	public void printCard(){
		//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
		System.out.print(getSuit()+" "+getRank());
	}
	public Suit getSuit(){
		return suit;
	}
	public Rank getRank(){
		return rank;
	}
}
