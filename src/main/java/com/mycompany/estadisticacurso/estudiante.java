/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estadisticacurso;

/**
 *
 * @author labctr
 */
public class estudiante {
    private float nota;
    private int semestre;
    public estudiante (float nota, int semestre){
        this.nota=nota;
        this.semestre=semestre;
    }
     public float getNota() {
        return nota;
    }
    public int getSemestre() {
        return semestre;
    }
}
