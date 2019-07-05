import lombok.*;

/**
 * Created by Robert Burek
 */

@Builder
@ToString
@EqualsAndHashCode  //(onlyExplicitlyIncluded = true) - tylko wskazane
@AllArgsConstructor
@NoArgsConstructor
public class ExampleModel {

    @Getter
    @Setter
    //@EqualsAndHashCode.Include  - ten wskazany
    private String hairColor;
    @Getter
    @Setter
    private int heigth;
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private int width;  //wykluczony z Equals
    @Getter
    @Setter
    private boolean isMale;
    @Getter
    @Setter
    private int age;

    //    Builder  wtedy można zapisać instancje w ten
//    sposób: exampleModelDuplicate.setHeigth(178).setHairColor("Blond");
    public ExampleModel myHeigth(int heigth) {
        this.heigth = heigth;
        return this;
    }

    public ExampleModel myHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }

    public ExampleModel myWidth(int width) {
        this.width = width;
        return this;
    }

    public ExampleModel myMale(boolean male) {
        isMale = male;
        return this;
    }

    public ExampleModel myAge(int age) {
        this.age = age;
        return this;
    }
    //    Konstruktory wygenerowane poleceniem Intellij
//    public ExampleModel(String hairColor, int heigth, boolean isMale, int age) {
//        this.hairColor = hairColor;
//        this.heigth = heigth;
//        this.isMale = isMale;
//        this.age = age;
//    }
//
//    public ExampleModel() {
//    }


    //    Metody wygenerowane poleceniem Intellij
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ExampleModel that = (ExampleModel) o;
//        return heigth == that.heigth &&
//                width == that.width &&
//                isMale == that.isMale &&
//                age == that.age &&
//                Objects.equals(hairColor, that.hairColor);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(hairColor, heigth, width, isMale, age);
//    }
}
