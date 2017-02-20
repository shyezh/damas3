package Damas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Jugadores extends Jugador{

    private final int i;

    public Jugadores(String jugador, int i) {
        super(jugador);
        this.i = i;
    }


    public String getJugador() {
        return Jugador;
    }

    public void setJugador(String Jugador) {
        this.Jugador = Jugador;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    @Override
    public int hashCode() {
        return Puntos * this.Jugador.length();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Jugadores) {
            Jugadores p = (Jugadores) o;
            return this.Jugador.equals(p.Jugador);
        } else {
            return false;
        }
    }
}
