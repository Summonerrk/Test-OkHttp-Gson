package okhttpgson.it.rr.testokhttpgson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity_View extends AppCompatActivity implements IView{

    Button btnGet;
    TextView tvAnswer;

    Presenter presenter;
    Model model;

    private String URL = "http://androiddocs.ru/api/friends.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnGet = (Button) findViewById(R.id.btnGet);
        tvAnswer = (TextView)findViewById(R.id.tvAnswer);

        model = new Model();
        presenter = new Presenter(this, model);
    }



    public void onClick(android.view.View v){
        switch (v.getId()) {

            case R.id.btnGet:
                presenter.getResponse(URL);
                break;
        }

    }

    public void setText(String answer){
        tvAnswer.setText(answer);
    }

}
