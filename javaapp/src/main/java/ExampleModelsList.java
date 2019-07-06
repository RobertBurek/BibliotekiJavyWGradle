import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by Robert Burek
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ExampleModelsList {
    //    @Getter @Setter
    private List<ExampleModel> exampleModelList;

}
