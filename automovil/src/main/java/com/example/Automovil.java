package com.example;

public class Automovil {

    static int contadorAutomoviles = 0;
    static int contadorViajes = 0;
    static int contadorViajesTotales = 0;
    static final int LIMITE_LEGAL = 100;


    public enum TipoCombustible{
        GASOLINA, 
        BIOETANO,
        DIESEL,
        GASNATURAL,
        ELECTRICO
    }

    public enum TipoAutomovil{
        COMPACTO, 
        FAMILIAR,
        EJECUTIVO,
        SUV
    }

    public enum Color {
        BLANCO, NEGRO, NARANJA
    }

    //Atributos
    private String marca;
    private String modelo;
    private int cilidraje;
    private TipoCombustible tipocCombustible;
    private TipoAutomovil tipoAutomovil;
    private Color color;
    private int numPuertas;
    private int numAsientos;
    private int velocidadMax;
    private int velocidadActual = 0;

    public class RegistroViaje{
        String fecha;
        private int distancia;
        private int tiempo;

        public RegistroViaje(String fecha, int distancia, int tiempo){
            this.fecha = fecha;
            this.distancia = distancia;
            this.tiempo = tiempo;
            contadorViajes++;
            contadorViajesTotales++;
        }

    }

    // Constructor
    public Automovil(
        String marca,
        String modelo
    ){
        this.marca =  marca;
        this.modelo = modelo;
        contadorAutomoviles++;
    };

    public Automovil(
        String marca,
        String modelo,
        int cilidraje
    ){
        this.marca =  marca;
        this.modelo = modelo;
        this.cilidraje = cilidraje;
        contadorAutomoviles++;
    };

    // Metodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilidraje() {
        return cilidraje;
    }

    public void setCilidraje(int cilidraje) {
        this.cilidraje = cilidraje;
    }

    public TipoCombustible getTipocCombustible() {
        return tipocCombustible;
    }

    public void setTipocCombustible(TipoCombustible tipocCombustible) {
        this.tipocCombustible = tipocCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getActual() {
        return velocidadActual;
    }

    public void setActual(int actual) {
        this.velocidadActual = actual;
    }

    public void acelerar(int velocidad){
        if(velocidad > this.velocidadMax){
            System.out.println("No se puede acelerar a esa velocidad");
        }else{
            this.velocidadActual = velocidad;
        }
    }

    public void desacelerar(int velocidad){
        if(velocidad < 0){
            System.out.println("No se puede desacelerar a esa velocidad");
        }else{
            this.velocidadActual = velocidad;
        }
    }

    public void frenar(){
        this.velocidadActual = 0;
    }

    public void frenar(String mensaje){
        this.velocidadActual = 0;
        System.out.println(mensaje);
    }


    public void calcularLlegada(int distancia){
        if(this.velocidadActual == 0){
            System.out.println("El auto esta detenido");
        }else{
            int tiempo = distancia / this.velocidadActual;
            System.out.println("El tiempo estimado de llegada es: " + tiempo + " horas");
        }
    }

    public void mostrarInformacion(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cilidraje: " + this.cilidraje);
        System.out.println("Tipo de combustible: " + this.tipocCombustible);
        System.out.println("Tipo de automovil: " + this.tipoAutomovil);
        System.out.println("Numero de puertas: " + this.numPuertas);
        System.out.println("Numero de asientos: " + this.numAsientos);
        System.out.println("Velocidad maxima: " + this.velocidadMax);
        System.out.println("Velocidad actual: " + this.velocidadActual);
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilidraje=" + cilidraje +
                ", tipocCombustible=" + tipocCombustible +
                ", tipoAutomovil=" + tipoAutomovil +
                ", numPuertas=" + numPuertas +
                ", numAsientos=" + numAsientos +
                ", velocidadMax=" + velocidadMax +
                ", velocidadActual=" + velocidadActual +
                '}';        
    }
}
