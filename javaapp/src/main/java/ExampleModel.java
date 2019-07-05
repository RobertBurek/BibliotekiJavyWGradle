import lombok.*;
import lombok.extern.java.Log;

/**
 * Created by Robert Burek
 */

@Log
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
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
    @EqualsAndHashCode.Exclude
    private int width;
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private boolean isMale;
    @Getter
    @Setter
    private int age;
    //    @EqualsAndHashCode.Exclude - jeżeli nie wykluczymy z equals to musimy dodać adnotację lomboka do klasy Cloth
//    a jak wykluczymy tutaj Cloth z equals to adnotacja w klasie Cloth nie jest konieczna
    @Getter
    @Setter
    private Cloth cloth;
//    @Getter @Setter
//    private List<Cloth> cloths;
}
