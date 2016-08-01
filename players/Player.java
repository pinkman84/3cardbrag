package players;
import dealer.*;
import cards.*;
import java.util.*;


public class Player {

  private String name;
  public  ArrayList<Card> hand;
  private int money;
  private int highCard;

  WinningCombinations handCombo;

  public Player(String name){
    this.name = name;
    this.hand = new ArrayList<Card>();
    this.money = money;
    this.highCard = highCard;
    // this.handScore = handCombo;

  }

  public String getName(){
    return this.name;
  }

  public String getHand(){
    String cards = "";
    for (Card card : hand){
      cards += "You have the " + card.getValue().getCardName() + " of " + card.getSuit().getCardSuit() + " ";
    }
    return cards.trim();
  }

  public void addCard(Card card){
      hand.add(card);
  }

  public int getHighCard(){
    highCard = 0;
    for (Card card : hand){
      if (card.getValue().getCardValue() > highCard){
        highCard = card.getValue().getCardValue();
      }
    }
    return highCard;
  }

  // public int getHandScore(){
  //   Card card1 = hand.get(0);
  //   Card card2 = hand.get(1);
  //   Card card3 = hand.get(2);
    
  // }



}