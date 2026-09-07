package org.laboratorio1.service;

import org.laboratorio1.model.Estudiante;

public class ServicioEvaluacion {
    // Constante NOTA_MINIMA
    public static final double NOTA_MINIMA = 6.0;

    // Calcula el promedio de las notas del estudiante
    public double calcularPromedio(Estudiante estudiante) {
        if (estudiante.getNotas() == null || estudiante.getNotas().isEmpty()) {
            return 0.0;
        }

        double suma = 0.0;
        // Bucle para recorrer la lista de notas
        for (Double nota : estudiante.getNotas()) {
            suma += (double) nota; // Conversión explícita/unboxing
        }

        return suma / estudiante.getNotas().size();
    }

    // Evalúa si el estudiante aprueba o reprueba
    public String obtenerEstado(Estudiante estudiante) {
        double promedio = calcularPromedio(estudiante);
        
        // Sentencia de selección (if-else)
        if (promedio >= NOTA_MINIMA) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}