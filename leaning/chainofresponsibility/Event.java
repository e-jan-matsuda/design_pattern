package chainofresponsibility;

/**
 * loggerに渡される記録対象。
 */
public class Event {
  private final int loglevel;
  private final String message;

  public Event(int loglevel, String message) {
    this.loglevel = loglevel;
    this.message = message;
  }

  public int loglevel() {
    return loglevel;
  }

  public String message() {
    return message;
  }
}
