package abstractfactory;

import java.io.PrintStream;

public class Main {
  static PrintStream out = System.out;
  public static void main(String[] args) {
    Factory stock;

    /*
      AbstractFactoryパターンを使うことで、
      下のようにFactoryMethodを切り替えても
      利用側はそれを意識することなく同じように使える。
      ifの削減などにもつかえる
     */
    out.println("Factory→Monster");
    stock = new MonsterFactory();
    getOneTwo(stock);

    out.println("Factory→RedBull");
    stock = new RedBullFactory();
    getOneTwo(stock);

  }

  /**
   * 商品番号0と1の商品を取り出す
   *
   * @param stock 商品を取り出すことができるFactory Methodをもったクラス
   */
  public static void getOneTwo(Factory stock){
    Product newOne;
    newOne = stock.takeNew(0);
    out.println(newOne.name());
    newOne = stock.takeNew(1);
    out.println(newOne.name());
  }

}
