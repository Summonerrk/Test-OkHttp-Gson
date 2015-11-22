package okhttpgson.it.rr.testokhttpgson;

/**
 * Created by Ruslan on 22.11.2015.
 */
public class Presenter implements IPresenter{

    IView view;
    IModel model;


    public Presenter(IView view, IModel model){
        this.model = model;
        this.view = view;
    }







    public void getResponse(String URL){
        String X = model.getResponse(URL);
        view.setText(X);
    }

}
