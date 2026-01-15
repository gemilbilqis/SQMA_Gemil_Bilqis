import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatematicaTestA {

    @Test
    public void testSuma() {
        Matematica m = new Matematica();
        assertEquals(5, m.suma(2, 3));
    }

    @Test
    public void testEstePar() {
        Matematica m = new Matematica();
        assertTrue(m.estePar(4));
    }
}