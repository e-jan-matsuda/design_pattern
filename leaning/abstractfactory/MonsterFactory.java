package abstractfactory;

public class MonsterFactory extends Factory{

  @Override
  public Product takeNew(int productNumber) {
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


