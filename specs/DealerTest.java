import static org.junit.Assert.*;
import org.junit.*;
import cards.*;
import dealer.*;

public class DealerTest {

  Dealer dealer;

  @Before
  public void before(){
    dealer = new Dealer();
  }

  @Test
  public void canMakeDeck(){
    dealer.makeDeck();
    assertEquals(52, dealer.deck.size());
  }

  @Test
  public void firstCardSuit(){
    dealer.makeDeck();
    assertEquals(SuitType.DIAMONDS, dealer.deck.get(0).getSuit());
  }

  @Test
  public void firstCardValue(){
    dealer.makeDeck();
    assertEquals(ValueType.KING, dealer.deck.get(0).getValue());
  }

  @Test
  public void canShuffleDeck(){
    dealer.makeDeck();
    dealer.shuffleDeck();
    assertNotEquals(ValueType.KING, dealer.deck.get(0).getValue());
  }

  @Test
  public void canDealTopCard(){
    dealer.makeDeck();
    assertEquals("King", dealer.dealTopCard().getValue().getCardName());
  }

  @Test
  public void dealingShouldReduceDeckSize(){
    dealer.makeDeck();
    dealer.dealTopCard();
    assertEquals(51, dealer.deck.size());
  }

}