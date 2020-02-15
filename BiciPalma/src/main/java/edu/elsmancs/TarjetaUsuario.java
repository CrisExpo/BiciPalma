package edu.elsmancs;

public class TarjetaUsuario {

    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    public String getId() {

        return id;
    }

    public boolean estaActivada() {

        return activada;
    }
}
