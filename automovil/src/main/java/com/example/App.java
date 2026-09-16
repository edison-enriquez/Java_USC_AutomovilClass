package com.example;

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
        Automovil auto1 =  new Automovil("Chevrolet", "Spark");
        Automovil auto2 =  new Automovil("Renault", "Sandero", 1200);

        RegistroViaje viaje1 = auto1.new RegistroViaje("2023-10-01", 100, 2);
        RegistroViaje viaje2 = auto2.new RegistroViaje("2023-10-02", 150, 3);

        System.out.println(Automovil.contadorAutomoviles);
        System.out.println(Automovil.contadorViajes);
    }
}
