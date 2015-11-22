package okhttpgson.it.rr.testokhttpgson;

/**
 * Created by Ruslan on 22.11.2015.
 */

public class Model implements IModel {



    //OkHttpClient client = new OkHttpClient();

    public String getResponse(String URL) {
        /*Request request = new Request.Builder()
                .url(URL)
                .build();

        Response response = client.newCall(request).execute();
        view.setAnswer(response.body().string());*/


        return("Gson blabla");
    }


}
