import org.junit.Test;

import junit.framework.TestCase;

public class DistanciaTest extends TestCase {
    @Test
    public void testMain() {
        int d = Distancia.calculaDistancia("1,2,3,2,5,1,4");
        assertEquals(80, d);
        d = Distancia.calculaDistancia("1,4,5");
        assertEquals(85, d);
    }
}
