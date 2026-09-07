package org.laboratorio1.controller;

import org.laboratorio1.model.Estudiante;
import org.laboratorio1.service.ServicioEvaluacion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REGISTRO DE ESTUDIANTE ===");
        
        // Solicitar datos iniciales
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el carnet del estudiante: ");
        String carnet = scanner.nextLine();

        // Instanciar un objeto de tipo Estudiante
        Estudiante estudiante = new Estudiante(nombre, carnet);

        // Pedir la cantidad de notas a registrar
        System.out.print("¿Cuántas notas desea ingresar?: ");
        int cantidadNotas = scanner.nextInt();

        // Leer cada nota y usar agregarNota
        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.print("Ingrese la nota #" + i + ": ");
            double nota = scanner.nextDouble();
            estudiante.agregarNota(nota);
        }

        // Instanciar el servicio de evaluación
        ServicioEvaluacion servicio = new ServicioEvaluacion();

        // Obtener promedio y estado mediante los métodos del servicio
        double promedio = servicio.calcularPromedio(estudiante);
        String estado = servicio.obtenerEstado(estudiante);

        // Imprimir reporte final en consola
        System.out.println("\n==================================");
        System.out.println("        REPORTE ACADÉMICO         ");
        System.out.println("==================================");
        System.out.println("Estudiante : " + estudiante.getNombre());
        System.out.println("Carnet     : " + estudiante.getCarnet());
        System.out.println("Promedio   : " + String.format("%.2f", promedio));
        System.out.println("Estado     : " + estado);
        System.out.println("==================================");

        scanner.close();
    }
}