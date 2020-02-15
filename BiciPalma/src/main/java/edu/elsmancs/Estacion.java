package edu.elsmancs;

public class Estacion {

    final int id;
    final String direccion;
    final int numeroAnclajes;

    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
    }

    public void consultarEstacion() {
        System.out.println("id: " + id + "\n" +
                "direccion: " + direccion + "\n" +
                "numeroAnclajes: " + numeroAnclajes);
    }

    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (Bicicleta anclaje : anclajes) {
            if (anclaje == null) {
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }
}
