import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.contornos.Mates;

public class MatesTest {
    @Test
    public void testDividir() {
        int resultado = Mates.dividirStatic(10, 0);
        assertEquals(1, resultado);
    }
        @Test
    public void testSumar() {
        int resultado = Mates.sumarStatic(32, 0);
        assertEquals(32, resultado);
    }

    @Test
    public void testRestar() {
        Mates contas = new Mates();
        int resultado = contas.restar(10, 4);
        assertEquals(6, resultado);
    }
}
