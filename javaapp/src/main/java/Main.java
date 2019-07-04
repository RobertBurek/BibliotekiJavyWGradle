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
        exampleModel.getHairColor();

    }
}
