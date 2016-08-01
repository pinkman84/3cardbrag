package players;

public enum WinningCombinations {
  THREEOFAKIND(600, "3 of a Kind!!!"),
  STRAIGHTFLUSH(500, "Straight Flush"),
  RUN(400, "Run"),
  FLUSH(300, "Flush"),
  PAIR(200, "Pair"),
  HIGHCARD(100, "High Card");


  private int comboValue;
  private String comboName;

  WinningCombinations(int comboValue, String comboName){
    this.comboValue = comboValue;
    this.comboName = comboName;
  }

  public int getComboValue(){
    return this.comboValue;
  }

  public String getComboName(){
    return this.comboName;
  }
}