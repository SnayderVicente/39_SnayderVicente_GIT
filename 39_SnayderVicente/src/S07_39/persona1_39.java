/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S07_39;

/**
 *
 * @author Lenovo
 */
public class persona1_39 {

    String nombre;
    int edad;
    String genero;
    
    public persona1_39() {
        this.nombre = "";
        this.edad = 0;
        this.genero = "";
    }
    
    public persona1_39(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    public void caminar() {
        System.out.println("La persona está caminando.");
    }
    
    public void hablar(String mensaje) {
        System.out.println("La persona está diciendo: \"" + mensaje + "\"");
    }
    
    public void hablar() {
        System.out.println("La persona está hablando.");
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public String getGenero() {
        return this.genero;
    }
}
