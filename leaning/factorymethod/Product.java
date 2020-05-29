package factorymethod;

public abstract class Product {
  protected final int productID;
  protected final String name;

  public Product(int productID, String name){
    this.productID = productID;
    this.name = name;
  }

  /**
   * @return この商品の名前
   */
  public String name() {
    return name;
  }

  /**
   * @return この商品のプロダクトID
   */
  public int productID() {
    return productID;
  }

}


