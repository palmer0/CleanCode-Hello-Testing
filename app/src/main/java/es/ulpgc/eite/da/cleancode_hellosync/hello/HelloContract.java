package es.ulpgc.eite.da.cleancode_hellosync.hello;

import java.lang.ref.WeakReference;

public interface HelloContract {

  interface View {
    void injectPresenter(Presenter presenter);
    void navigateToByeScreen();
    void displayHelloData(HelloViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResumeCalled();
    void sayHelloButtonClicked();
    void goByeButtonClicked();
  }

  interface Model {

    String getHelloMessage();
  }

}