package edu.elsmancs;

import org.junit.Test;
import static org.junit.Assert.*;

public class BicicletaTest {
    @Test
    public void crearBicicleta() {
        Bicicleta miBici = new Bicicleta(4234);
        assertEquals(4234, miBici.getId());
    }
}