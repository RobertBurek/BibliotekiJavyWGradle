import lombok.extern.java.Log;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robert Burek
 */

@Log
public class Main {

    public static void main(String[] args) throws Exception {

        List<Cloth> clothList = new ArrayList<>();
        clothList.add(new Cloth("Green", true));
        clothList.add(new Cloth("Red", false));

//      Nie posiada bezargumentowego konstruktora i korzystamy z innej klasy - ArrayList<>()
//      Nie może być - Arrays.asList(new Cloth("Green", true), new Cloth("Red", false));
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setHairColor("Blond");
        exampleModel.setHeigth(178);
        exampleModel.setWidth(45);
        exampleModel.setMale(true);
        exampleModel.setAge(40);
        exampleModel.setCloths(clothList);
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = new ExampleModel();
        exampleModelDuplicate.setAge(40);
        exampleModelDuplicate.setMale(false);
        exampleModelDuplicate.setHairColor("Blond");
        exampleModelDuplicate.setHeigth(178);
        exampleModelDuplicate.setWidth(60);
        exampleModelDuplicate.setCloths(clothList);
        System.out.print("exampleModelDuplicate: ");
        System.out.println(exampleModelDuplicate);
        System.out.println("");
        System.out.print("exampleModel  vs  exampleModelDuplicate : ");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");


        System.out.println("-----------------------Simple XML------------------------");

        Serializer serializer = new Persister();
        File result = new File("example.xml");
        serializer.write(exampleModel, result);

        ExampleModel readExampleModel = serializer.read(ExampleModel.class, result);
        log.info(readExampleModel.toString());
        log.info(exampleModel.toString());
        log.info(String.valueOf(exampleModel.equals(readExampleModel)));

        System.out.println("-----------------------SimpleXML------Klasa->tablica obiektów--------------");
//        Sam obiekt typu ArrayList nie jest wspierany w SimpleXML, trzeba użyć klasy z taką tablicą.

        List<ExampleModel> listaExampleModels = new ArrayList<>();
        listaExampleModels.add(exampleModel);
        listaExampleModels.add(exampleModelDuplicate);

        ExampleModelsList exampleModelsList = new ExampleModelsList(listaExampleModels);

        Serializer serializerL = new Persister();
        File resultL = new File("exampleL.xml");
        serializer.write(exampleModelsList, resultL);

        ExampleModelsList readExampleModelsList = serializerL.read(ExampleModelsList.class, resultL);
        log.info(readExampleModelsList.toString());
        log.info(exampleModelsList.toString());
        log.info(String.valueOf(exampleModelsList.equals(readExampleModelsList)));
    }
}
