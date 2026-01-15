import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatematicaTestB {

    @Test
    public void testRaport() {
        Matematica m = new Matematica();
        assertEquals(2, m.raport(4, 2));
    }
}