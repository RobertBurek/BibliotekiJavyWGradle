import lombok.*;

/**
 * Created by Robert Burek
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@EqualsAndHashCode    // albo tutaj adnotacja albo w klasie ExampleModel wykluczenie z equals
public class Cloth {
    //    @Getter       wykorzystujemy tylko konstruktora, więc nie jest potrzebne, wypada aby był dostęp do pól w klasie
//    @Setter       wykorzystujemy tylko konstruktora, więc nie jest potrzebne, wypada aby był dostęp do pól w klasie
    private String color;
    //    @Getter       wykorzystujemy tylko konstruktora, więc nie jest potrzebne, wypada aby był dostęp do pól w klasie
//    @Setter       wykorzystujemy tylko konstruktora, więc nie jest potrzebne, wypada aby był dostęp do pól w klasie
    private Boolean isNew;
}
