package com.example;

import java.util.ArrayList;
import java.util.Vector;

import com.example.Automovil.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        ArrayList<Automovil> listaAutomoviles = new ArrayList<>();
        Vector<Automovil> vectorAutomoviles = new Vector<>();

        Automovil auto1 =  new Automovil("Chevrolet", "Spark");
        Automovil auto2 =  new Automovil("Renault", "Sandero", 1200);

        vectorAutomoviles.add(auto1);
        vectorAutomoviles.add(auto2);

        listaAutomoviles.add(auto1);
        listaAutomoviles.add(auto2);
        listaAutomoviles.add(new Automovil("Toyota", "Corolla", 1800));
        listaAutomoviles.add(new Automovil("Honda", "Civic", 2000));
        listaAutomoviles.add(new Automovil("Ford", "Focus", 1600));
        listaAutomoviles.add(new Automovil("Nissan", "Versa", 1500));

        //RegistroViaje viaje1 = auto1.new RegistroViaje("2023-10-01", 100, 2);
        //RegistroViaje viaje2 = auto2.new RegistroViaje("2023-10-02", 150, 3);

        System.out.println(listaAutomoviles.size());
        for (Automovil automovil : listaAutomoviles) {
            System.out.println(automovil.getMarca() + " " + automovil.getModelo());
        }

        for (Automovil automovil : vectorAutomoviles) {
            System.out.println(automovil.getMarca() + " " + automovil.getModelo());
        }
    }
}
