package factorymethod;

public class Factory {

  /*
    これがFactory Methodの本体。クラスを切っていることは本質ではなく、Productが増えても、このメソッドだけを変更すれば良くなったというのが本質。
   */
  public Product takeNew(int productNumber) {
    switch (productNumber) {
      case 0:
        return new MonsterEnergy();
      case 1:
        return new MonsterKhaos();
      default:
        throw new IllegalArgumentException("Product ID" + productNumber + " is Undifined");
    }
  }
}
