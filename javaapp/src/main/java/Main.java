import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

//    public static final String json ="{\"hairColor\":\"Blond\",\"heigth\":178,\"width\":45,\"isMale\":true,\"age\":40}";

    public static void main(String[] args) {

        Gson gson = new Gson();

        List<Cloth> clothList = Arrays.asList(new Cloth("Green", true), new Cloth("Red", false));
        ExampleModel exampleModel = ExampleModel.builder()
                .cloths(clothList)
                .hairColor("Blond")
                .heigth(178)
                .width(45)
                .isMale(true)
                .age(40)
                .build();
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = ExampleModel.builder()
                .cloths(clothList)
                .age(40)
                .isMale(false)
                .hairColor("Blond")
                .heigth(178)
                .width(60)
                .build();
        System.out.print("exampleModelDuplicate: ");
        System.out.println(exampleModelDuplicate);
        System.out.println("");
        System.out.print("exampleModel  vs  exampleModelDuplicate : ");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");


        System.out.println("-----------------------Gson------------------------");

        List<ExampleModel> listaExampleModels = Arrays.asList(exampleModel, exampleModelDuplicate);
        String json = gson.toJson(listaExampleModels);
        log.info(json);
        // dane json są tablicą, zatem należy zastosować klasę TypeToken
        List<ExampleModel> fromJsonExampleList = gson.fromJson(json,
                new TypeToken<List<ExampleModel>>() {
                }.getType());

        System.out.print("fromJsonExampleList: ");
        System.out.println(fromJsonExampleList);
        System.out.println("");
        System.out.print("listaExampleModels  vs  fromJsonExampleList : ");
        System.out.println(listaExampleModels.equals(fromJsonExampleList));
        if (listaExampleModels.equals(fromJsonExampleList))
            log.info("Listy obiektów są takie same!");
        log.info(fromJsonExampleList.toString());

        new Gson();
    }
}
