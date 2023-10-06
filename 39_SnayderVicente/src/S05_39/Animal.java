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
public class Animal {
    // Atributos
    String especie;
    String habitat;
    int edad;
    
    // Constructores
    public Animal() {
        this.especie = "";
        this.habitat = "";
        this.edad = 0;
    }
    
    public Animal(String especie, String habitat, int edad) {
        this.especie = especie;
        this.habitat = habitat;
        this.edad = edad;
    }
    
    // Métodos
    public void comer() {
        System.out.println("El animal está comiendo.");
    }
    
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
    
    // Métodos con valores de retorno
    public String getEspecie() {
        return this.especie;
    }
    
    public String getHabitat() {
        return this.habitat;
    }
    
    public int getEdad() {
        return this.edad;
    }
}
