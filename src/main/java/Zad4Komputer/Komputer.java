package Zad4Komputer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Komputer {
    protected int moc;
    protected String producent;
    protected TypProcesora procesora;


}
