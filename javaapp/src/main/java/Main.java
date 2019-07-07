import lombok.extern.java.Log;
import okhttp3.*;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

    public static void main(String[] args) throws Exception {

        //  Wysyłanie danych na serwer
        System.out.println("--------------------Wysyłanie na serwer----------------------");

        OkHttpClient clientOut = new OkHttpClient();

        RequestBody body = new FormBody.Builder()
                .add("id", "1")
                .add("title", "foo")
                .add("body", "bar")
                .add("userId", "1")
                .build();

        Request requestOut = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/1")
                .headers(new Headers.Builder().add("Content-type", "application/json; charset=UTF-8").build())
                .method("PUT", body)
                .build();


        Response responseOut = clientOut.newCall(requestOut).execute();
        log.info(responseOut.body().string());

        log.info("koniec bloku");

    }
}
