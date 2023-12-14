/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticacurso;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class curso {
    private String nombre;
    private int cantidad;
    public curso (String nombre, int cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
    } 
        public int getCantidad() {
        return cantidad;
    }
public int calcularModa(ArrayList<estudiante> estudiantes) {
    HashMap<Integer, Integer> frecuenciaSemestres = new HashMap<>();
    for (estudiante estudiante : estudiantes) {
        int semestre = estudiante.getSemestre();
        frecuenciaSemestres.put(semestre, frecuenciaSemestres.getOrDefault(semestre, 0) + 1);
    }

    int modaSemestre = estudiantes.get(0).getSemestre();
    int frecuenciaMaxima = 0;

    for (Map.Entry<Integer, Integer> entry : frecuenciaSemestres.entrySet()) {
        int semestre = entry.getKey();
        int frecuencia = entry.getValue();

        if (frecuencia > frecuenciaMaxima) {
            modaSemestre = semestre;
            frecuenciaMaxima = frecuencia;
        }
    }
    return modaSemestre;
}
 public int[] mostrarDatos(ArrayList<estudiante> estudiantes) {
        int aprobados = 0;
        int reprobados = 0;

        for (estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        return new int[]{aprobados, reprobados};
    }
 public float calcularEstadisticas(ArrayList<estudiante> estudiantes) {
        float sumaNotas = 0;
        for (estudiante estudiante : estudiantes) {
            sumaNotas = sumaNotas + estudiante.getNota();
        }
        return sumaNotas / estudiantes.size();
    }
}
