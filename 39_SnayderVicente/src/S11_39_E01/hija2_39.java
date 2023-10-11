/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_39_E01;

/**
 *
 * @author Lenovo
 */
public class hija2_39 extends persona_39 {
    private String deporteFavorito;
    private double altura;
    private boolean tieneMascota;

    public hija2_39(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public hija2_39(String nombre, int edad, String deporteFavorito, double altura, boolean tieneMascota) {
        super(nombre, edad);
        this.deporteFavorito = deporteFavorito;
        this.altura = altura;
        this.tieneMascota = tieneMascota;
    }
    
    public String getDeporteFavorito() {
        return deporteFavorito;
    }
    
    public double getAltura() {
        return altura;
    }
}
