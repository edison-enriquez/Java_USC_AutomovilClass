package com.example;

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
        System.out.println("Hello World!");
    }
}
