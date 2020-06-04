package chainofresponsibility;

public class LogController {
  static AbstractLogger error = new ErrorLogger();
  static AbstractLogger notice = new NoticeLogger();
  static AbstractLogger debug = new DebugLevelLogger();
  static AbstractLogger startPoint;

  public LogController(){
    error.setNext(notice).setNext(debug);
    startPoint = error;
  }

  /**
   * logを書き込む
   *
   * @param event 発生したイベント
   */
  public void log(Event event){
    startPoint.log(event);
  }
}
