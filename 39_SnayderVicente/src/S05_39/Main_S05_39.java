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
public class Main_S05_39 {
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 20, "Ingeniería");
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        
        estudiante1.mostrarDatos();
        libro1.mostrarDatos();
        
        // Aquí puedes hacer más cosas con las instancias de las clases...
    }
}

