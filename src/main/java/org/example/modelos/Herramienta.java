package org.example.modelos;

public class Herramienta {

    private String nombre;
    private Double  danoCausado; //0-100

    public Herramienta() {
    }

    public Herramienta(String nombre, Double danoCausado) {
        this.nombre = nombre;
        this.danoCausado = danoCausado;
    }
}
