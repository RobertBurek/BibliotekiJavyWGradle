import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.java.Log;

/**
 * Created by Robert Burek
 */

@Log
@Builder
@Data
public class ExampleModel {

    private String hairColor;
    private int heigth;
    @EqualsAndHashCode.Exclude
    private int width;
    @EqualsAndHashCode.Exclude
    private boolean isMale;
    private int age;
    private Cloth cloth;
}
