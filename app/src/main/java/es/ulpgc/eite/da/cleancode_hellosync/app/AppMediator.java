package es.ulpgc.eite.da.cleancode_hellosync.app;


import es.ulpgc.eite.da.cleancode_hellosync.hello.HelloState;

public class AppMediator {

  private HelloState helloState;

  private HelloToByeState helloToByeState;
  private ByeToHelloState byeToHelloState;

  private static AppMediator INSTANCE;

  private AppMediator() {
    helloState = new HelloState();
  }

  public static void resetInstance() {
    INSTANCE = null;
  }

  public static AppMediator getInstance() {
    if(INSTANCE == null){
      INSTANCE = new AppMediator();
    }

    return INSTANCE;
  }

  public HelloState getHelloState() {
    return helloState;
  }

  public HelloToByeState getHelloToByeState() {
    HelloToByeState state = helloToByeState;
    helloToByeState = null;
    return state;
  }

  public void setHelloToByeState(HelloToByeState state) {
    this.helloToByeState = state;
  }

  public ByeToHelloState getByeToHelloState() {
    ByeToHelloState state = byeToHelloState;
    byeToHelloState = null;
    return state;
  }

  public void setByeToHelloState(ByeToHelloState state) {
    this.byeToHelloState = state;
  }
}
