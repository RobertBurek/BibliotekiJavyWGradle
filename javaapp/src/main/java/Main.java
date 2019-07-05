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
        ExampleModel exampleModel = new ExampleModel("Blond", 178, 45, true, 40);
        System.out.println(exampleModel);

//        Ręcznie napisane metody zwracajace klasę z ustawionym polem
        ExampleModel exampleModelBuilder = new ExampleModel();
        exampleModelBuilder
                .myAge(54)
                .myHairColor("Red")
                .myMale(true)
                .myWidth(45)
                .myHeigth(178);
        System.out.println(exampleModelBuilder);

//        Metody wygenerowane przez LOMBOKA
        ExampleModel exampleModelBuilder2 = ExampleModel.builder()
                .age(54)
                .isMale(true)
                .hairColor("Red")
                .heigth(178)
                .width(60)
                .build();
        System.out.println(exampleModelBuilder2);
        System.out.println(exampleModelBuilder.equals(exampleModelBuilder2));

        ExampleModel exampleModelDuplicate = new ExampleModel();
        exampleModelDuplicate.setAge(40);
        exampleModelDuplicate.setHeigth(178);
        exampleModelDuplicate.setHairColor("Blond");
        exampleModelDuplicate.setWidth(20);
        exampleModelDuplicate.setMale(true);
        System.out.println(exampleModelDuplicate);

        System.out.println(exampleModel.equals(exampleModelDuplicate));
    }
}
