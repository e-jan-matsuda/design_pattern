package chainofresponsibility;

public class NoticeLogger extends AbstractLogger{

  private static final String HEADER = "NOTICE";
  public static final int LEVEL = 5;

  public NoticeLogger() {
    super(LEVEL, HEADER);
  }
}
