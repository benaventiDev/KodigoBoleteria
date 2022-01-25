package org.example;

import clases.Boletos;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
class BoletasTest {
    @Test
    void getTotal() {
        Boletos Boletas = new Boletos(7, 1, true, "test");
        assertEquals(1470.0, Boletas.factura(7));
        // assertEquals(4, Calculator.add(2, 2));
    }
}

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        BoletasTest test = new BoletasTest();
        test.getTotal();
    }
}
