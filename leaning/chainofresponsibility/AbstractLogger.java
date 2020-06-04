package chainofresponsibility;

/**
 * 一般的な概念図で言うところのResponsibleクラス
 * 基本は
 * - 次にパスする先 -> next
 * - リクエストに対する自分の処理 -> log()
 * この2つがあるのがベース
 */
public abstract class AbstractLogger {

  protected AbstractLogger next;
  protected final String header;
  protected final int logLevel;

  /**
   * @param logLevel このloggerの対応するloglevel
   * @param header 記録するときに書き込むheader
   */
  public AbstractLogger(int logLevel, String header){
    this.logLevel = logLevel;
    this.header = header;
  }

  /**
   * このloggerが処理できないEventを受け取った時、次にわたすloggerを設定する
   *
   * @param next このloggerの次にrequestを処理するlogger
   * @return 設定したlogger
   * @memo
   *
   */
  public AbstractLogger setNext(AbstractLogger next){
    this.next = next;
    return next;
  }

  /**
   * 渡されたイベントが自分が処理するものかどうかを判定する
   *
   * @param event 渡されたイベント
   * @return このイベントが自分が処理するものかどうか
   */
  protected boolean isTarget(Event event){
    return event.loglevel() == this.logLevel;
  }

  /**
   * 自分より下位or直接呼び出されるlogへの書き込み行うメソッド。イベントが自分の対象では無い時、定義された次のloggerに動作を要求する。
   *
   * @param event 発生したイベント
   */
  public void log(Event event){
    if(isTarget(event)){
      writeLog(event);
    }else{
      next.log(event);
    }
  }

  /**
   * 実際のlogging処理
   * @param event logに書き込む対象
   */
  protected void writeLog(Event event){
    System.out.println(makeLogMessage(event));
  }

  /**
   * logに書き込むメッセージをフォーマットする
   * @param event 記録する対象
   * @return フォーマット済み文字列
   */
  protected String makeLogMessage(Event event){
    return "["+this.header+"]:"+event.message();
  }
}
