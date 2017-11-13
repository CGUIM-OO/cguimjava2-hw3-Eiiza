package object_orientation_HW3;

import java.util.ArrayList;
import java.util.Random;



public class Deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> usedCards;
	public int nUsed;
	
	public Deck(int nDeck){
		cards=new ArrayList<Card>();
		//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
		//Hint: Use new Card(x,y) and 3 for loops to add card into deck
		//Sample code start
		//Card card=new Card(1,1); ->means new card as clubs ace
		//cards.add(card);
		//Sample code end
		for(int i=0;i<nDeck;i++){
			for(Card.Suit s1:Card.Suit.values()){
				for(int r1 =0;r1<14;r1++){
					Card card=new Card(s1,r1);
					cards.add(card);
				}
			}
		}
	}	
	//TODO: Please implement the method to print all cards on screen (10 points)
	public void printDeck(){
		//Hint: print all items in ArrayList<Card> cards, 
		//TODO: please implement and reuse printCard method in Card class (5 points)
		int i=0;
		while(i<cards.size()){
			cards.get(i).printCard();
			i++;
		}
	}
	public ArrayList<Card> getAllCards(){
		return cards;
	}
	public void shuffle(){
		Random rnd= new Random();
		int i=rnd.nextInt(cards.size());	//�üƭn�]�W����
		for(int j=0;j<cards.size();j++){	
			Card n=cards.get(j);
			cards.add(i,n);
		}	//�����ǿ�P����A���üƥX�Ӫ��H����m
	
		
	}
	public Card getOneCard(){
		Card temp = null;
		
		if (cards.size()==0){
			cards.addAll(usedCards);
			shuffle();
			return getOneCard();
		}
		else{
			temp = cards.get(0);
			usedCards.add(temp);
			nUsed++;
			cards.remove(0);
		}
		return temp;
	}
}
