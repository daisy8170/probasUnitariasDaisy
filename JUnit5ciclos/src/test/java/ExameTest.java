import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import com.contornos.Exame;

public class ExameTest {
    
    @Test 
    public void testCalcularResultadoSuspenso(){
        Exame e = new Exame("Daisy", 9);
        String resultado = e.calcularResultado();
        assertEquals("Supenso", resultado);
    }
     @Test 
    public void testCalcularResultadoAprobado(){
        Exame e = new Exame("Daisy", 9);
        String resultado = e.calcularResultado();
        assertEquals("Aprobado", resultado);
    }
     @Test 
    public void testCalcularResultadoSobresaliente(){
        Exame e = new Exame("Daisy", 9);
        String resultado = e.calcularResultado();
        assertEquals("Sobresaliente", resultado);
    }
         @Test 
    public void testCalcularResultadoNotable(){
        Exame e = new Exame("Daisy", 9);
        String resultado = e.calcularResultado();
        assertEquals("Notable", resultado);
    }
}
