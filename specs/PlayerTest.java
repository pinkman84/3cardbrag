import static org.junit.Assert.*;
import org.junit.*;
import players.*;
import cards.*;


public class PlayerTest {

  Player player;
  Card card1;
  Card card2;
  Card card3;

  @Before
  public void before(){
    player = new Player("Aidan");
    card1 = new Card(ValueType.THREE, SuitType.DIAMONDS);
    card2 = new Card(ValueType.THREE, SuitType.HEARTS);
    card3 = new Card(ValueType.THREE, SuitType.CLUBS);
  }

  @Test
  public void canGetName(){
    assertEquals("Aidan", player.getName());
  }

  @Test
  public void canLookAtDeck(){
    player.addCard(card1);
    player.addCard(card2);
    player.addCard(card3);
    assertEquals("You have the Three of Diamonds You have the Three of Hearts You have the Three of Clubs", player.getHand());
  }

  @Test
  public void canGetHighCard(){
    Card card4 = new Card(ValueType.KING, SuitType.SPADES);
    player.addCard(card1);
    player.addCard(card2);
    player.addCard(card4);
    assertEquals(13, player.getHighCard());
  }


}