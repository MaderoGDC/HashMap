/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main (String[]args){
    Equipo A = new Equipo("A");
    Jugador j1= new Jugador(1,"Juan");
    boolean resultado = A.;
    HashMap lista = A.getJugadores();
    if(resultado==true){
            System.out.println("ingresado");
    }else{
            System.out.println("no se logro ingresar al equipo");
    }

//for1
    for(Jugador jugador:A.getJugadores()){
        System.out.println(jugador.getNombre());;
    }
//for2
    for(int i=0; i<A.getJugadores().size();i++){
        Jugador jugador = A.getJugadores().get(i);
        System.out.println(jugador.getNombre());
    }
//otra forma de imprimir
        System.out.println(A.toString());
    }
    
}
