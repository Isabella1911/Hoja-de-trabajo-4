/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Isabella Obando 23074*/
import static org.junit.Assert.*;

import org.junit.Test;

public class InfixToPostfixTest {

    @Test
public void testInfixToPostfix() {
    // Prueba simple
    assertEquals("123*+", InfixToPostfix.convert("1+2*3"));

    // Prueba con paréntesis
    assertEquals("12+3*4+", InfixToPostfix.convert("(1+2)*3+4"));
}
}
