package information;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class information {
    private Integer informationId;
    private String name;
    private String email;
    private String faculty;

}
