import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest {

  Card card;

  @Before
  public void before(){
    card = new Card(ValueType.KING, SuitType.HEARTS);
  }

  @Test
  public void canGetValue(){
    assertEquals(ValueType.KING, card.getValue());
  }

  @Test
  public void canGetSuit(){
    assertEquals(SuitType.HEARTS, card.getSuit());
  }

}