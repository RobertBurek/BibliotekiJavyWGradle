import lombok.extern.java.Log;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.IOException;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

    public static void main(String[] args) throws Exception {

        //Tworzymy klienta http
        OkHttpClient client = new OkHttpClient();

        //Tworzemy zapytanie http (gdzie są dane?)
        // generator xml : https://countwordsfree.com/xmlviewer#save
        Request request = new Request.Builder()
                .url("https://countwordsfree.com/download/txt/fbdc03fe-8c6a-4ce1-917c-a22a2de7295d")
                .build();

        //Tworzymy reakcję na pobranie lub nie pobranie danych
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                log.info(e.toString());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                String xml = response.body().string();
                Serializer serializer = new Persister();
                try {
                    Cloth readCloth = serializer.read(Cloth.class, xml);
                    log.info(readCloth.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        log.info("koniec bloku");

    }
}
