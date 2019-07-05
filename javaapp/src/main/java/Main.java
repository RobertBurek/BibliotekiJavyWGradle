import com.google.gson.Gson;
import lombok.extern.java.Log;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

    public static void main(String[] args) {

        ExampleModel exampleModel = new ExampleModel("Blond", 178, 45, true, 40);
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

        new Gson();
    }
}
