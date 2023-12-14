/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticacurso;
import java.util.Scanner;
import java.util.ArrayList;
public class EstadisticaCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = scanner.nextLine();  
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 
        ArrayList<estudiante> estudiantes = new ArrayList<>();
        curso miCurso = new curso(nombreCurso, cantidad);
        for (int i=0; i<cantidad;i++){
            System.out.println("Ingrese la nota del estudiante " + (i + 1) + ": ");
            float nota = scanner.nextFloat();
            System.out.println("Ingrese el semestre del estudiante " + (i + 1) + ": ");
            int semestre = scanner.nextInt();
            scanner.nextLine();
            estudiantes.add(new estudiante(nota, semestre));
        }
        int modaSemestre = miCurso.calcularModa(estudiantes);
        System.out.println("La moda de los semestres de los estudiantes es: " + modaSemestre);
           int[] resultados = miCurso.mostrarDatos(estudiantes);
    
    System.out.println("Cantidad de estudiantes aprobados: " + resultados[0]);
    System.out.println("Cantidad de estudiantes reprobados: " + resultados[1]);
    float promedio = miCurso.calcularEstadisticas(estudiantes);
    System.out.println("El promedio de notas del curso es: " + promedio);
}   
    }
