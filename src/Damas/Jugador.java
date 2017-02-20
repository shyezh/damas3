
package Damas;


public abstract class Jugador {
    public String jugador;

    public String Jugador;
    public int Puntos;
    
    public String getJugador() {
        return jugador;
    }
    public Jugador(String Jugador, int Puntos) {
        this.Jugador = Jugador;
        this.Puntos = Puntos;
    }
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public Jugador(String jugador) {
        this.jugador = jugador;
    }
    
}
