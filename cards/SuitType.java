package cards;

public enum SuitType {
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    SPADES("Spades");

    private String suitName;

    SuitType(String suitName){
      this.suitName = suitName;
    }

    public String getCardSuit(){
      return this.suitName;
    }

}