package abstractfactory;

public class RedBull extends Product {
  private static int PRODUCT_ID = 0;
  private static String PRODUCT_NAME = "RedBull";

  public RedBull() {
    super(PRODUCT_ID, PRODUCT_NAME);
  }
}
