package edu.elsmancs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TarjetaUsuarioTest {

    @Test
    public void crearTarjetaUsuario() {
        TarjetaUsuario tarjetaDani = new TarjetaUsuario("43462005", true);
        assertEquals("43462005", tarjetaDani.getId());
        assertEquals(true, tarjetaDani.estaActivada());
    }

}
