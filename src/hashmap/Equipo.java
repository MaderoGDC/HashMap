/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Equipo {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private HashMap<String,Jugador>jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Jugador> getJugadores() {
        return jugadores;
    }   
    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", jugadores=" + jugadores + '}';
    }
    public boolean addJugador(Jugador jugador){
        String cedula = ""+jugador.getCedula();
    return this.jugadores.put(cedula, jugador);
    }
    
}
