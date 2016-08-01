package cards;

public enum ValueType {
  KING(13, "King"),
  QUEEN(12, "Queen"),
  JACK(11, "Jack"),
  TEN(10, "Ten"),
  NINE(9, "Nine"),
  EIGHT(8, "Eight"),
  SEVEN(7, "Seven"),
  SIX(6, "Six"),
  FIVE(5, "Five"),
  FOUR(4, "Four"),
  THREE(3, "Three"),
  TWO(2, "Two"),
  ACE(1, "Ace");

  private int cardValue;
  private String cardName;

  ValueType(int cardValue, String cardName){
    this.cardValue = cardValue;
    this.cardName = cardName;
  }

  public int getCardValue(){
    return this.cardValue;
  }

  public String getCardName(){
    return this.cardName;
  }

}