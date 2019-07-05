import com.google.gson.Gson;
import lombok.extern.java.Log;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

//    public static final String json ="{\"hairColor\":\"Blond\",\"heigth\":178,\"width\":45,\"isMale\":true,\"age\":40}";

    public static void main(String[] args) {

        Gson gson = new Gson();

        ExampleModel exampleModel = ExampleModel.builder()
                .cloth(new Cloth("Green", true))
                .hairColor("Blond")
                .heigth(178)
                .width(45)
                .isMale(true)
                .age(40)
                .build();
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = ExampleModel.builder()
                .age(40)
                .isMale(false)
                .hairColor("Blond")
                .heigth(178)
                .width(60)
                .build();
        System.out.print("exampleModelDuplicate: ");
        System.out.println(exampleModelDuplicate);
        System.out.println("");
        System.out.println("exampleModel  vs  exampleModelDuplicate");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");

        System.out.println("-----------------------Gson------------------------");

        String json = gson.toJson(exampleModel);
        // Załóżmy, że string json przyszedł z internetu lub z pliku
        ExampleModel fromJsonExampleModel = gson.fromJson(json, ExampleModel.class);

        System.out.print("fromJsonExampleModel: ");
        System.out.println(fromJsonExampleModel);
        System.out.println("");
        System.out.print("exampleModel  vs  fromJsonExampleModel : ");
        System.out.println(exampleModel.equals(fromJsonExampleModel));
        if (exampleModel.equals(fromJsonExampleModel))
            log.info("Obiekty są takie same!");

        new Gson();
    }
}
