package edu.elsmancs;

public class Estacion {

    final int id;
    final String direccion;
    final int numeroAnclajes;
    Bicicleta[] anclajes;


    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[numeroAnclajes];

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

    public void consultarAnclajes() {
        for (int posicion = 0; posicion < numeroAnclajes; posicion++) {
            if (anclajes[posicion] == null) {
                System.out.println("Anclaje " + (posicion+1) + " libre");
            } else {
                System.out.println("Anclaje " + (posicion+1) + " " + anclajes[posicion].getId());
            }
        }
    }
    private void mostrarAnclaje(Bicicleta bici, int numeroAnclaje) {
        System.out.println("bicicleta " + bici.getId() + " anclada en el anclaje: " + numeroAnclaje);
    }

    public void anclarBicicleta(Bicicleta bici) {
        int numeroAnclaje = 0;
        while (numeroAnclaje < numeroAnclajes) {
            if (anclajes[numeroAnclaje] == null) {
                anclajes[numeroAnclaje] = bici;
                mostrarAnclaje(bici, numeroAnclaje+1);
                break;
            }
            numeroAnclaje++;
        }
    }

    public void retirarBicicleta(TarjetaUsuario tarjetaUsuario) {
        if (tarjetaUsuario.estaActivada()) {
            int anclajeEscogido = generarAnclaje();
            Bicicleta bicicletaEscogida = anclajes[anclajeEscogido];
            mostrarBicicleta(bicicletaEscogida, anclajeEscogido+1);
            anclajes[anclajeEscogido] = null;
        }
    }
}
