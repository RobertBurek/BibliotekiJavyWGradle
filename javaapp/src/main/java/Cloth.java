import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Robert Burek
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode    // albo tutaj adnotacja albo w klasie ExampleModel wykluczenie z equals
public class Cloth {
    //    @Getter       wykorzystujemy tylko konstruktora, więc nie jest potrzebne, wypada aby był dostęp do pól w klasie
//    @Setter       wykorzystujemy tylko konstruktora, więc nie jest potrzebne, wypada aby był dostęp do pól w klasie
    private String color;
    //    @Getter       wykorzystujemy tylko konstruktora, więc nie jest potrzebne, wypada aby był dostęp do pól w klasie
//    @Setter       wykorzystujemy tylko konstruktora, więc nie jest potrzebne, wypada aby był dostęp do pól w klasie
    private boolean isNew;
}
