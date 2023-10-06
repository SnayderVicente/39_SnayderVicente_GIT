/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_39;

/**
 *
 * @author Lenovo
 */
import javax.swing.JOptionPane;

public class Estudiante {

    String nombre;
    int edad;
    String carrera;
    
    public Estudiante() {
        this.nombre = "";
        this.edad = 0;
        this.carrera = "";
    }
    
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    
    public void estudiar() {
        System.out.println("El estudiante está estudiando.");
    }
    
    public void hacerTarea(String tarea) {
        System.out.println("El estudiante está haciendo la tarea de " + tarea + ".");
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public String getCarrera() {
        return this.carrera;
    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nCarrera: " + this.carrera);
    }
}