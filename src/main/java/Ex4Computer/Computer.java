package Ex4Computer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    private int power;
    private String manufacturer;
    private EProcessor processor;


}
