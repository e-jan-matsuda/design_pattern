package factorymethod;


import java.io.PrintStream;

public class Main {
  public static void main(String[] args) {
    Product newOne;
    Factory stock = new Factory();
    PrintStream out = System.out;

    /*
      factory methodを使うことでここでnewすることはなく、
      (今回だと)商品のバリエーションや内容に変更があってもその変更はfactory method内で済む
     */
    newOne = takeNew(1);
    out.println(newOne.name());
    newOne = takeNew(1);
    out.println(newOne.name());
  }

  /**
   * Factory Methodはここに書いてもいい、本質的にはおなじ。
   * 要は、このメソッド外でnewしたりオブジェクトを生成することがなければよい。
   *
   * @param productNumber 商品のID
   * @return 対応する商品
   */
  public static Product takeNew(int productNumber){
    switch (productNumber){
      case 0:
        return new MonsterEnergy();
      case 1:
        return new MonsterKhaos();
      default:
        throw new IllegalArgumentException("Product ID"+productNumber+" is Undifined");
    }
  }
}
