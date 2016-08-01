package dealer;
import cards.*;
import players.*;
import java.util.*;

public class Dealer {

 public ArrayList<Card> deck;
 public ArrayList<Player> players;

  public Dealer() {

    this.deck = new ArrayList<Card>();
    this.players = new ArrayList<Player>();

  }


  public void makeDeck(){
    for(SuitType suit : SuitType.values()){
      for(ValueType value : ValueType.values()){
        Card card = new Card(value, suit);
        deck.add(card);
      }
    }
  }

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }

  public void addPlayer(Player player){
    players.add(player);
  }

  public Card dealTopCard(){
    Card topCard = deck.get(0);
    deck.remove(0);
    return topCard;
  }

  public void typicalGame(){
    for (int i = 0; i < 3 ; i++ ) {
      for (Player player : players){
        player.addCard(dealTopCard());
      }      
    }
  }

}