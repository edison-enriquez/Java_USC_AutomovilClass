package com.example;

public class Automovil {

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
    private int numPuertas;
    private int numAsientos;
    private int velocidadMax;
    private int actual = 0;

    // Constructor
    public Automovil(
        String marca,
        String modelo
    ){
        this.marca =  marca;
        this.modelo = modelo;
    };

    public Automovil(
        String marca,
        String modelo,
        int cilidraje
    ){
        this.marca =  marca;
        this.modelo = modelo;
        this.cilidraje = cilidraje;
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
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

}
