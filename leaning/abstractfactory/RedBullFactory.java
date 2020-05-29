package abstractfactory;

public class RedBullFactory extends Factory{
  @Override
  public Product takeNew(int productNumber) {
    switch (productNumber){
      case 0:
        return new RedBull();
      case 1:
        return new RedBullSugarFree();
      default:
        throw new IllegalArgumentException("Product ID"+productNumber+" is Undifined");
    }
  }
}
