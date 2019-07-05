import lombok.extern.java.Log;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

    public static void main(String[] args) throws Exception {

        List<Cloth> clothList = Arrays.asList(new Cloth("Green", true), new Cloth("Red", false));
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setHairColor("Blond");
        exampleModel.setHeigth(178);
        exampleModel.setWidth(45);
        exampleModel.setMale(true);
        exampleModel.setAge(40);
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = new ExampleModel();
        exampleModelDuplicate.setAge(40);
        exampleModelDuplicate.setMale(false);
        exampleModelDuplicate.setHairColor("Blond");
        exampleModelDuplicate.setHeigth(178);
        exampleModelDuplicate.setWidth(60);
        System.out.print("exampleModelDuplicate: ");
        System.out.println(exampleModelDuplicate);
        System.out.println("");
        System.out.print("exampleModel  vs  exampleModelDuplicate : ");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");


        System.out.println("-----------------------Simple XML------------------------");

        List<ExampleModel> listaExampleModels = Arrays.asList(exampleModel, exampleModelDuplicate);

        Serializer serializer = new Persister();
        File result = new File("example.xml");
        serializer.write(exampleModel, result);

        ExampleModel readExampleModel = serializer.read(ExampleModel.class, result);
        log.info(readExampleModel.toString());
        log.info(exampleModel.toString());
        log.info(String.valueOf(exampleModel.equals(readExampleModel)));
    }
}
