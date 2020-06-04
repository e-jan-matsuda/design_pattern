package chainofresponsibility;

public class DebugLevelLogger extends AbstractLogger{

  private static final String HEADER = "DEBUG";
  public static final int LEVEL = 0;

  public DebugLevelLogger() {
    super(LEVEL, HEADER);
  }
}
