package chainofresponsibility;

public class ErrorLogger extends AbstractLogger{

  private static final String HEADER = "ERROR";
  public static final int LEVEL = 10;

  public ErrorLogger() {
    super(LEVEL, HEADER);
  }

  @Override
  protected void writeLog(Event event) {
    System.err.println(makeLogMessage(event));
  }
}
