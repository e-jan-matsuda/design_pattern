package abstractfactory;

public class RedBullSugarFree extends Product {
  private static int PRODUCT_ID = 1;
  private static String PRODUCT_NAME = "RedBull SugarFree";


  public RedBullSugarFree() {
    super(PRODUCT_ID, PRODUCT_NAME);
  }

}
