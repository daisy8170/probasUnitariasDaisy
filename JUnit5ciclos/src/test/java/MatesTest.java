import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import com.contornos.Mates;

public class MatesTest {
    @Test
    public void testDividir() {
        int resultado = Mates.dividirStatic(10,0);
        assertEquals(561, resultado);
    }

    @Test
    public void testMultiplicar() {
        int resultado = Mates.multiplicarStatic(10,0);
        assertEquals(89890, resultado);
    }



    @Test
    public void testSumar() {
        int resultado = Mates.sumarStatic(32, 100);
        assertEquals(76876, resultado);
    }

    @Test
    public void testRestar() {
        Mates contas = new Mates();
        int resultado = contas.restar(10, 4);
        assertEquals(687, resultado);
    }
}
