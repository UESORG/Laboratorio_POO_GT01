package org.laboratorio1.model;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String carnet;
    private ArrayList<Double> notas;

    // Constructor que inicializa nombre, carnet y la lista de notas
    public Estudiante(String nombre, String carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.notas = new ArrayList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    // Método para agregar una calificación a la lista
    public void agregarNota(double nota) {
        this.notas.add(nota);
    }
}