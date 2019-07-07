package Zad9Zajezdnia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Pojazd {

    private int maxPredkosc;
    private int numerPojazdu;

    abstract String getOpis();


}
