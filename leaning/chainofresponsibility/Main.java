package chainofresponsibility;

public class Main {

  public static void main(String[] args) {
    Event debugLevelEvent = new Event(DebugLevelLogger.LEVEL, "This is debug level message.");
    Event errorLevelEvent = new Event(ErrorLogger.LEVEL, "This is error level message.");
    Event noticeLevelEvent = new Event(NoticeLogger.LEVEL, "This is notice level message.");
    LogController logger = new LogController();

    logger.log(debugLevelEvent);
    logger.log(errorLevelEvent);
    logger.log(noticeLevelEvent);
  }
}
