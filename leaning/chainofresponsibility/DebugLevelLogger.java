package chainofresponsibility;

public class DebugLevelLogger extends AbstractLogger{

  private static final String HEADER = "DEBUG";
  public static final int LEVEL = 0;

  public DebugLevelLogger() {
    super(LEVEL, HEADER);
    this.setNext(null);
  }

  /**
   * デバックレベルはすべてのメッセージを出力するので、渡されたものはすべてDEBUGとして出力するようにする。
   * 実装時このクラスのnextは常にnullである。
   * @param event 渡されたイベント
   * @return 必ずtrue
   */
  @Override
  protected boolean isTarget(Event event) {
    return true;
  }

  @Override
  public void log(Event event) {
    System.out.println(makeLogMessage(event));
  }

  /**
   * @param next このloggerの次にrequestを処理するlogger
   * @throws IllegalAccessError このクラスのsetNextが呼ばれることはない。
   */
  @Override
  public AbstractLogger setNext(AbstractLogger next) {
    throw new IllegalAccessError();
  }
}
