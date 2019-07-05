import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

    public static void main(String[] args) {

        List<Cloth> clothList = Arrays.asList(new Cloth("Green", true), new Cloth("Red", false));
        ExampleModel exampleModel = ExampleModel.builder()
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
        System.out.print("exampleModel  vs  exampleModelDuplicate : ");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");


        System.out.println("-----------------------Simple XML------------------------");

        List<ExampleModel> listaExampleModels = Arrays.asList(exampleModel, exampleModelDuplicate);

    }
}
