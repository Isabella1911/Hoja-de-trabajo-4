/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Isabella Obando 23074*/
import static org.junit.Assert.*;

import org.junit.Test;

public class PostfixEvaluatorTest {

    @Test
    public void testEvaluatePostfix() {
        assertEquals(6, PostfixEvaluator.evaluate("23*"));
        assertEquals(6, PostfixEvaluator.evaluate("34*2/"));
    }
}
