package factorymethod;

public class MonsterEnergy extends Product {
  private static int PRODUCT_ID = 0;

  public MonsterEnergy() {
    super(PRODUCT_ID,
      "MonsterEnergy");
  }
}
