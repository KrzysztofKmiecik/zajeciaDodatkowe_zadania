package Ex9Depot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Vehicle {

    private int macVelocity;
    private int vehiculeNumber;

    abstract String getDescription();


}
