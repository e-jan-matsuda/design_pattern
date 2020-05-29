package abstractfactory;

/**
 * これをabstract factoryたらしめる抽象クラス。
 * 利用する側は、このクラスを使うことで機能の実態(拡張した具象クラス)が容易に入れ替え可能になる
 */
public abstract class Factory {
  public abstract Product takeNew(int productNumber);
}
