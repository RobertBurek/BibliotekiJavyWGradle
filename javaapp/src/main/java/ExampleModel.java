import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Robert Burek
 */
@ToString
public class ExampleModel {

    @Getter
    @Setter
    private String hairColor;
    @Getter
    @Setter
    private int heigth;
    @Getter
    @Setter
    private int width;
    @Getter
    @Setter
    private boolean isMale;
    @Getter
    @Setter
    private int age;

}
