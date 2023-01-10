package kodlama.io.kodlamaiodevs.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSubTechnologyRequest {
    private int id;
    private String name;
}
