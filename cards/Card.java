package cards;

public class Card{

  SuitType suit;
  ValueType value;

  public Card(ValueType value, SuitType suit){
    this.value = value;
    this.suit = suit;
  }


  public ValueType getValue(){
    return this.value;
  }

  public SuitType getSuit(){
    return this.suit;
  }


}