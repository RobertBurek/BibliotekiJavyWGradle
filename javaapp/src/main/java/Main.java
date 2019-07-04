import lombok.AllArgsConstructor;

/**
 * Created by Robert Burek
 */

@AllArgsConstructor  //adnotacja z lomboka
public class Main {

    Boolean a;
    Boolean b;
    Boolean c;

    public static void main(String[] args) {

        new Main(true, true, true);
        ExampleModel exampleModel = new ExampleModel();
        exampleModel.setAge(40);
        exampleModel.setHairColor("Blond");
        exampleModel.setHeigth(178);
        exampleModel.setMale(true);

        System.out.println(exampleModel);
    }
}
