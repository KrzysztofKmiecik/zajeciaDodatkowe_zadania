package Zad4Komputer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Komputer {
    private int moc;
    private String producent;
    private TypProcesora procesora;


}
