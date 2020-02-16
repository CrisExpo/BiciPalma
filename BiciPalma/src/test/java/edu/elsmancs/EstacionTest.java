package edu.elsmancs;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class EstacionTest {

    @Test
    public void crearEstacion() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(6, estacion.anclajesLibres());
    }

    @Test
    public void anclajesLibresTest() {
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(6, estacion.anclajesLibres());

    }
}