import lombok.*;

/**
 * Created by Robert Burek
 */
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
