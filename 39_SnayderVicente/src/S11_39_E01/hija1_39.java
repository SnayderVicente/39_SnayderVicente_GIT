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
public class hija1_39 extends persona_39 {
    private String hobby;
    private boolean esEstudiante;
    private int horasDeSueno;

    public hija1_39(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public hija1_39(String nombre, int edad, String hobby, boolean esEstudiante, int horasDeSueno) {
        super(nombre, edad);
        this.hobby = hobby;
        this.esEstudiante = esEstudiante;
        this.horasDeSueno = horasDeSueno;
    }
    
    public String getHobby() {
        return hobby;
    }
    
    public boolean esEstudiante() {
        return esEstudiante;
    }
}
