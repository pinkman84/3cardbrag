import java.util.*;
import dealer.*;
import cards.*;
import players.*;

class Runner{

  public static void main(String[] args) {

    HashMap display = new HashMap();
    Player player1 = new Player("Aidan");
    Player player2 = new Player("Chris");
    Player player3 = new Player("Andrew");
    Player player4 = new Player("Lewis");
    Dealer dealer = new Dealer();

    dealer.makeDeck();
    dealer.shuffleDeck();
    dealer.addPlayer(player1);
    dealer.addPlayer(player2);
    dealer.addPlayer(player3);
    dealer.addPlayer(player4);
    dealer.typicalGame();

    // System.out.println(player1.getName()+ " " + player1.getHand());
    // System.out.println(player2.getName()+ " " + player2.getHand());
    // System.out.println(player3.getName()+ " " + player3.getHand());
    // System.out.println(player4.getName()+ " " + player4.getHand());

    display.put(player1.getName(), player1.getHand());
    display.put(player2.getName(), player2.getHand());
    display.put(player3.getName(), player3.getHand());
    display.put(player4.getName(), player4.getHand());

    Set set = display.entrySet();
    Iterator i = set.iterator();
    while(i.hasNext()){
        Map.Entry me = (Map.Entry)i.next();
        System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());
    }
    System.out.println();
    // int highCardValue = ((int)display.get(player1)).player1.getHighCard();
    display.put(player1.getName(), player1.getHighCard());
    System.out.println(player1.getName() + "'s High Card is " + display.get(player1.getHighCard()));



  }

}